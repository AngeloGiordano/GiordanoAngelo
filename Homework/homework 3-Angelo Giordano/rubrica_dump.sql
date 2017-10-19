
# #####################
# DUMPING DATA PHONE 
# #####################

INSERT INTO country (code, name) VALUES
					('KR', 'South Korea'),
					('JP', 'Japan'),
					('CA', 'Canada'),
					('CH', 'China'),
					('SW', 'Sweden'),
					('US', 'United States'),
					('IT', 'Italy'),
                    ('FR', 'France');
                    
INSERT INTO brand (id, name, country) VALUES
				(1, 'SAMSUNG', 'KR'),
				(2, 'ACER', 'KR'),
				(3, 'AMOI', 'CH'),
				(4, 'HTC', 'KR'),
				(5, 'APPLE', 'US'),
				(6, 'HP', 'US'),
				(7, 'LG', 'KR'),
				(8, 'SONY', 'JP'),
				(9, 'MOTOROLA', 'US'),
				(10, 'NOKIA', 'SW'),
				(11, 'BLACKBERRY', 'CA'),
				(12, 'BBK', 'CH'),
				(13, 'WIKO', 'FR');

INSERT INTO OpSys (id, description, company, openSource) VALUES
				(1, 'Android', 'Google', 1),
				(3, 'iOS', 'Apple Inc.', 0),
				(9, 'Windows Phone 8', 'Microsoft', 0),
				(11, 'BlackBerry', 'BlackBerry', 0);
INSERT INTO Utente (codicefiscale,nome,cognome,indirizzo,email) values
				('urbdgu42v7iiln','Andrea','Lodato','Via Castellani','andrew@gmail.com'),
				('lotmsn107o9vhbh','Vito','Malta','Via Orilia','vito@live.com'),
				('leavfo72q2ovmvu','Paola','Apicella','Via Pastore','paola@mail.it'),
				('pnrvgb73g1agvdm','Daniela','Della Mura','Via Luglio','dani@gmail.it'),
				('ostgnc42i5nhonb','Manuela','Genoa','Via Russo','sterlla@mail.it'),
				('shvipn710g6lteu','Francesco','Riccardo','Via Standa','riccardo@gmail.com'),
				('bubmfn410r9chif','Filomena','Manzo','Via Prova','manzo@outlook.it'),
				('qftvqq38g10lpir','Maria','Vuolo','Via Pagani',''),
				('piqoqd77i3vdaql','Jessica','Vuolo','Via Volturno',''),
				('irhtfr53f5lmvbp','Valeria','Giordano','Via Castellani','valery@mail.eg'),
				('crnmdn78g3lgbpo','Alessandro','Memoli','Via Cava',''),
				('qducfp55m8afblq','Cristian','Ronaldo','Via Porta','ronaldo@mail.it'),
				('tpsqeh86q7ahitb','Simona','Caniglia','Via Uiip','oioi@gmail.it'),
				('suflri55r6aqiso','Vanessa','Mauro','Via Lucia',''),
				('qrdulr94q10upsc','Mario','Bonaventura','Via Luna','fgfdd@gmail.com'),
				('ulnfan95t7mfebn','Gaetano','Abatemarco','Via Archimede','gaetano@mail.it'),
				('auaasu104r3tqdm','Giulio','Avagliano','Via Sole',''),
				('noqlmt92r10umbo','Simone','Lazio','Via marte','simone@outlook.it'),
				('fuinbs76s1osram','Salvatore','Caruto','Via Angri','');


INSERT INTO Smartphone (id, name, ram, cpu, displayPpi, displaySize, displayResolution, size, weight, notes, brand, opSys,contatto,numero) VALUES
				(1, 'HTC One M8', '2Gb', '2.3 GHz quad-core CPU', 468, '4.7', '1080x1920', '146x70x9', 160, ' ', 4, 1,'urbdgu42v7iiln','3203843507'),
				(2, 'Iphone 5S', '1Gb', '1.3 GHz dual-core CPU', 326, '4', '640x1136', '123x58x8', 112, ' ', 5, 3,'lotmsn107o9vhbh','3334567912'),
				(3, 'Galaxy Note 3', '3Gb', '2.3 GHz Quad core CPU', 386, '5.7', '1080x1920', '151x79x8', 168, ' ', 1, 1,'leavfo72q2ovmvu','3901234570'),
				(4, 'Galaxy S4', '2Gb', '1.9 GHz Quad core CPU', 441, '5.0', '1080x1920', '136x69x8', 130, ' ', 1, 1,'pnrvgb73g1agvdm','5847504736'),
				(5, 'Galaxy S5', '2Gb', '2.5 GHz Quad core CPU', 432, '5.1', '1080x1920', '142x72x8', 145, 'Water, Dust resistant', 1, 1,'ostgnc42i5nhonb','4594112397'),
				(6, 'Galaxy S4 mini', '1.5Gb', '1.7 GHz dual-core CPU', 256, '4.3', '540x960', '125x61x9', 107, ' ', 1, 1,'shvipn710g6lteu','3482049512'),
				(7, 'Moto X', '2Gb', '1.7 GHz dual-core CPU', 326, '4.7', '720x1280', '129x65x6', 130, ' ', 9, 1,'bubmfn410r9chif','4585832190'),
				(8, 'Lumia 1020', '2Gb', '1.5 GHz dual-core CPU', 386, '5.7', '768x1280', '130x71x10', 158, ' ', 10, 1,'qftvqq38g10lpir','4856701233'),
				(9, 'Nexus 5', '2Gb', '2.3 GHz Quad core CPU', 445, '4.95', '1080x1920', '138x69x8', 130, ' ', 7, 1,'piqoqd77i3vdaql','0891234567'),
				(10, 'G2', '2Gb', '2.26 GHz Quad core CPU', 424, '5.2', '1080x1920', '138x71x9', 143, '', 7, 1,'irhtfr53f5lmvbp','3457891230'),
				(11, 'Lumia 930', '2Gb', '2.2 GHz quad-core CPU', 441, '5.0', '1080x1920', '137x71x10', 167, ' ', 10, 9,'crnmdn78g3lgbpo','4900123412'),
				(12, 'Galaxy S III', '2Gb', '1.5 Ghz dual-core', 306, '4.8', '720x1280', '136x70x8', 133, '', 1, 1,'qducfp55m8afblq','5689123000'),
				(13, 'Galaxy S II', '1Gb', '1.2 GHz dual-core', 218, '4.3', '480x800', '123x66x8.5', 116, '', 1, 1,'tpsqeh86q7ahitb','9128745683'),
				(14, 'Blackberry Z30', '2Gb', '1.7 Ghz', 295, '5', '1280x768', '140x72x9.4', 170, '', 11, 11,'suflri55r6aqiso','5671029387'),
				(15, 'Vivo Xplay 3S', '3Gb', '2.3Ghz Quad core', 490, '6.0', '1440x2560', '158x82x8', 172, '', 12, 1,'qrdulr94q10upsc','0815155149'),
				(16, 'Lumia 520', '512Mb', '1 GHz dual-core ', 235, '4', '480x800', '119x64x10', 124, '', 10, 9,'ulnfan95t7mfebn','0823457891'),
				(17, '8S', '512Mb', '1 GHz Dual-core', 233, '4', '480x800', '120x63x10', 113, '', 4, 9,'auaasu104r3tqdm','8890012344'),
				(18, 'Ativ S Neo', '1Gb', '1.4 GHz dual-core', 308, '4.77', '720x1280', '135x69x9', 144, '', 1, 9,'noqlmt92r10umbo','087444540'),
				(19, '8X', '1Gb', '1.5 GHz dual-core', 342, '4.3', '720x1280', '32,35 x 66,2 x 10,12', 130, '', 4, 9,'fuinbs76s1osram','5612098424');

				
				

