create table "Games"(
	playerName varchar(255),
	gender varchar(255),
	dateCreated DateTime
	PRIMARY KEY (dateCreated)
);

create table "Savestate"(
	cash int,
	highScore int,
	body1 bit,
	body2 bit,
	body3 bit,
	tank1 bit,
	tank2 bit,
	tank3 bit,
	booster1 bit, 
	booster2 bit,
	booster3 bit,
	noseCap1 bit,
	noseCap2 bit,
	noseCap3 bit,
	fins1 bit,
	fins2 bit,
	fins3 bit,
	bodyEquipped varchar(255),
	tankEquipped varchar(255),
	boosterEquipped varchar(255),
	noseCapEquipped varchar(255),
	finsEquipped varchar(255),
	dateSaved DateTime
	PRIMARY KEY (dateSaved)
);

GO
