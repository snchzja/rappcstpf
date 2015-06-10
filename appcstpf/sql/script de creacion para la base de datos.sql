create database dbappcstpf;
use dbappcstpf;

create table Pais
(
paisID int unsigned not null,
pais varchar(20),
primary key(paisID)
);

create table Provincia
(
provinciaID int unsigned not null,
provincia varchar(30),
paisID int unsigned not null,
foreign key(paisID) references Pais(paisID)
on update cascade,
primary key(provinciaID)
);

create table Localidad
(
localidadID int unsigned not null,
localidad varchar(30),
provinciaID int unsigned not null,
foreign key(provinciaID) references Provincia(provinciaID)
on update cascade,
primary key(localidadID)
);

create table Sucursal
(
sucursalID int unsigned not null,
nombreSucursal varchar(20),
prioritarioPermitido boolean not null default false,
urgentePermitido boolean not null default false,
direccionSucursal varchar (30) not null,
telefonoSucursal varchar(30),
codigoPostalSucursal int unsigned not null,
horarioDeAtencion varchar(200),
latitudeSucursal double not null,
longitudeSucursal double not null,
localidadSucursal int unsigned not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(localidadSucursal) references Localidad(localidadID)
on update cascade,
primary key(sucursalID)
);

create table Usuario
(
usuario varchar(15) not null,
contrasenia varchar(700) not null,
dniUsuario int unsigned not null,
nombreUsuario varchar(40) not null,
apellidoUsuario varchar(40) not null,
domicilioUsuario varchar(50) not null,
telefonoUsuario varchar(20),
emailUsuario varchar(40) not null,
sexoUsuario char(1) not null,
fechaNacimientoUsuario date not null,
codigoPostalUsuario int unsigned,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
primary key(usuario)
);

create table Empleado
(
legajoEmpleado int unsigned not null,
usuario varchar(15) unique not null,
contrasenia varchar(700) not null,
dniEmpleado int unsigned not null,
nombreEmpleado varchar(40) not null,
apellidoEmpleado varchar(40) not null,
domicilioEmpleado varchar(50) not null,
telefonoEmpleado varchar(20),
emailEmpleado varchar(40),
sexoEmpleado char(1) not null,
fechaNacimientoEmpleado date not null,
codigoPostalEmpleado int unsigned not null,
cargoEmpleado varchar(20) not null,
departamentoEmpleado varchar(20) not null,
fechaIngresoEmpresa timestamp not null default current_timestamp,
sueldoEmpleado decimal (8,4) not null,
sucrsalTrabajaEmpleado int unsigned not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(sucrsalTrabajaEmpleado) references Sucursal(sucursalID)
on update cascade,
primary key(legajoEmpleado)
);

create table Gerente
(
legajoGerente int unsigned not null,
sucursalGerencia int unsigned not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(legajoGerente) references Empleado(legajoEmpleado)
on update cascade on delete cascade,
foreign key(sucursalGerencia) references Sucursal(sucursalID)
on update cascade,
primary key(legajoGerente)
);

create table Region
(
regionID int unsigned not null,
nombre varchar(20),
desdeKM int not null,
hastaKM int not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
primary key(regionID)
);

create table Servicio
(
servicioID int unsigned not null,
nombreServicio varchar(20) not null,
descServicio text,
region int unsigned not null,
precioBasico decimal(8,4),
kgBasico int,
kgPorExceso int,
estampillasPorExceso int,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(region) references Region(regionID)
on update cascade,
primary key(servicioID)
);

create table Seguro
(
seguroID int unsigned not null,
nombreSeguro varchar(20),
descSeguri text,
montoMaximoSeguro decimal(8,4),
montoMinimoSeguro decimal(8,4),
comisionPorEnvio  decimal(4,4),
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
primary key(seguroID)
);

create table Paquete
(
paqueteID int unsigned not null,
pesoPaquete decimal (4,4) not null,

-- Datos de Facturacion
costoBasicoPaquete decimal (8,4) not null,
costoSinSeguroPaquete decimal(8,4) not null,
costoTotalPaquete decimal(8,4) not null,
pagadoPaquete boolean not null,

-- Sucursales
origenPaquete int unsigned not null,
destinoPaquete int unsigned not null,
distanciaPaquete decimal (6,4) not null,

-- Datos del Servicio
servicioPaquete int unsigned not null,
nombreServicio varchar(20) not null,
kgPorExcesoPaquete int not null,
estampillasPorExcesoServicio int not null,
precioBasicoServicio decimal(8,4),
kgBasicoServicio int,

-- Datos del Seguro
tieneSeguroPaquete boolean not null,
seguroPaquete int unsigned not null,
montoAseguradoPaquete decimal(8,4),
comisionSeguroPaquete decimal(4,4),
costoSeguroPaquete decimal(8,4),

-- Datos del Remitente
clientePaquete varchar(15) not null,
dniRemitente int unsigned not null,
nombreRemitente varchar(40),
apellidoRemitente varchar(40),
direcionRemitente varchar(50),
telefonoRemitinte varchar(20),
codigoPostalRemitente int unsigned,
emailRemitente varchar(40),

-- Datos del Destinatario
dniDestinatario int unsigned not null,
nombreDestinatario varchar(40),
apellidoDestinatario varchar(40),
direcionDestinatario varchar(50),
telefonoDestinatario varchar(20),
codigoPostalDestinatario int unsigned,
emailDestinatario varchar(40),

fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(origenPaquete) references Sucursal(sucursalID)
on update cascade,
foreign key(destinoPaquete) references Sucursal(sucursalID)
on update cascade,
foreign key(clientePaquete) references Usuario(usuario)
on update cascade,
foreign key(servicioPaquete) references Servicio(servicioID)
on update cascade,
foreign key(seguroPaquete) references Seguro(seguroID)
on update cascade,
primary key(paqueteID)
);

create table TipoEstado
(
tipoEstadoID char(1),
nombretipoEstado varchar (20),
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
primary key(tipoEstadoID)
);

create table Estado
(
tipoEstadoID char(1) not null,
paqueteID int unsigned not null,
empleadoEstado int unsigned,
sucursalEstado int unsigned,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(tipoEstadoID) references TipoEstado(tipoEstadoID)
on update cascade,
foreign key(paqueteID) references Paquete(paqueteID)
on update cascade on delete cascade,
foreign key(empleadoEstado) references Empleado(legajoEmpleado)
on update cascade,
foreign key(sucursalEstado) references Sucursal(sucursalID)
on update cascade,
primary key(tipoEstadoID, paqueteID)
);

create table Factura
(
paqueteID int unsigned not null,
numeroFactura int unsigned not null,
tipoFactura char(1) not null,
montoTotalFactura decimal (8,4),

-- Datos del Cliente
clienteFactura varchar(15),
dniCliente int unsigned,
nombreCliente varchar(40),
apellidoCliente varchar(40),
direcionCliente varchar(50),
telefonoCliente varchar(20),
codigoPostalCliente int unsigned,
emailCliente varchar(40),

legajoEmpleado int unsigned,
sucursalId int unsigned,

fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(legajoEmpleado) references Empleado(legajoEmpleado)
on update cascade,
foreign key(sucursalId) references Sucursal(sucursalId)
on update cascade,
foreign key(paqueteID) references Paquete(paqueteID)
on update cascade,
primary key(paqueteID)
);

create table Camion
(
patenteCamion char(6) not null,
metrosCubicosCarga int,
marcaCamion varchar(20),
modeloCamion varchar(20),
anioCamion int unsigned,
cargaMaximaKGgCamion int unsigned,
descripcinCamion text,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
primary key(patenteCamion)
);

create table Ruta
(
sucursalOrigen int unsigned not null,
secursalDestino int unsigned not null,
distanciaRuta double,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(sucursalOrigen) references Sucursal(sucursalID)
on update cascade on delete cascade,
foreign key(secursalDestino) references Sucursal(sucursalID)
on update cascade on delete cascade,
primary key(sucursalOrigen, secursalDestino)
);

create table Transporte
(
transporteID int unsigned not null,
distanciaTotalTransporte double,
camionTransporte char(6) not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(camionTransporte) references Camion(patenteCamion)
on update cascade,
primary key(transporteID)
);

create table PaquetesPorTransporte
(
paqueteID int unsigned not null,
transporteID int unsigned not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(paqueteID) references Paquete(paqueteID)
on update cascade on delete cascade,
foreign key(transporteID) references Transporte(transporteID)
on update cascade on delete cascade,
primary key(paqueteID, transporteID)
);

create table RutasPorTransporte
(
sucursalOrigen int unsigned not null,
secursalDestino int unsigned not null,
transporteID int unsigned not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(sucursalOrigen, secursalDestino) references Ruta(sucursalOrigen, secursalDestino)
on update cascade on delete cascade,
foreign key(transporteID) references Transporte(transporteID)
on update cascade on delete cascade,
primary key(sucursalOrigen, secursalDestino, transporteID)

);

create table Role
(
roleID char(1),
roleNombre varchar (20),
roleDescripcion text,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
primary key(roleID)
);

create table Login
(
usuario varchar(15) not null,
roleID char(1) not null,
fechaRegistro timestamp not null default current_timestamp,
fechaModificacion timestamp not null default current_timestamp on update current_timestamp,
foreign key(roleID) references Role(roleID)
on update cascade,
primary key(usuario)
);