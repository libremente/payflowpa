-- INTESTATARI

INSERT INTO INTESTATARI
( ABI , ABIACCENTRATORE , BOLLOVIRTUALE , CAB , CHIAVESSB , CODICEPOSTEL , CODICESOFTWARE , DENOMINAZIONE , FUNZIONIABILITATE , GRUPPO , ID_INDIRIZZIPOSTALI , INTESTATARIO   , LAPL             , RAGIONESOCIALE     , RAPL , RCZ , RECORDLOCK , SIA , STATO , TIPOINTESTATARIO , TIPOSICUREZZA , UFFPOSTALE , AZIENDAMIGRATA , IMPORTOMAXFLUSSO , NONRESIDENTE , TMB_PRIMA_ATT   , TMB_ULTIMA_ATT  , CODICECUC , EMAIL , ISSR , CATEGORIA , SOTTOCATEGORIA , PR_VERSIONE , OP_INSERIMENTO , TS_INSERIMENTO  , OP_AGGIORNAMENTO , TS_AGGIORNAMENTO , VERSION , FLAG_COMUNICAZIONI ) VALUES
(NULL ,NULL             ,NULL           ,NULL ,NULL       ,NULL          ,NULL            ,NULL           ,NULL               ,NULL    ,NULL                 ,'ADMINCORPORATE','0000000000000000','Admin',NULL  ,NULL ,NULL        ,NULL ,NULL   ,NULL              ,NULL           ,NULL        ,NULL            ,NULL              ,NULL          ,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,NULL       ,NULL   ,NULL  ,'BO'       ,NULL            ,1            ,'SCRIPT'        ,CURRENT_TIMESTAMP,NULL              ,CURRENT_TIMESTAMP ,0        ,'N'                 )
;

-- JLTTRPA

INSERT INTO JLTTRPA
( ID_TRIBUTO       , DE_TRB         , CD_ADE , TP_ENTRATA , FL_PREDETERM , FL_INIZIATIVA , SOGG_ESCLUSI , CDPAGAMENTOSPONTANEO , STATO , PR_VERSIONE , OP_INSERIMENTO , TS_INSERIMENTO  , OP_AGGIORNAMENTO , TS_AGGIORNAMENTO , VERSION , ISTRUZIONI_PAGAMENTO ) VALUES
('DEFAULT','Debito Generico',NULL    ,'T'         ,NULL          ,NULL           ,NULL          ,NULL                  ,'A'    ,0            ,'INSERIMENTO'   ,CURRENT_TIMESTAMP,NULL              ,NULL              ,0        ,NULL                  )
;

-- JLTENTP

INSERT INTO JLTENTP
( TP_ENTE     , DE_ENTE            , STATO , PR_VERSIONE , OP_INSERIMENTO , TS_INSERIMENTO  , OP_AGGIORNAMENTO , TS_AGGIORNAMENTO , VERSION ) VALUES
('DEFAULT','Creditore Generico','A'    ,1            ,'SCRIPT'        ,CURRENT_TIMESTAMP,NULL              ,NULL              ,0        )
;

-- TIMERS

INSERT INTO TIMERSIRIS (ID, TIMER, `INTERVAL`, PERIOD, NODE_ACTIVE, NODE_DEFAULT, GRUPPO,STARTUP) VALUES (51, 'TimerLoaderTimer', 15000, 30000, '*', 'node1', 'SYSTEM',null);
INSERT INTO TIMERSIRIS (ID, TIMER, `INTERVAL`, PERIOD, NODE_ACTIVE, NODE_DEFAULT, GRUPPO,STARTUP) VALUES (30,'EventNotificationTimer',60000,240000,'node1','node1','IRIS',null);


-- CFG_FORNITORE_GATEWAY

INSERT INTO CFG_FORNITORE_GATEWAY (`ID`,`BUNDLE_KEY`,`DESCRIZIONE`,`ST_RIGA`,`OP_INSERIMENTO`,`TS_INSERIMENTO`,`OP_AGGIORNAMENTO`,`TS_AGGIORNAMENTO`,`VERSION`) VALUES
( 4, 'NDP','NODO DEI PAGAMENTI-SPC','V','SCRIPT',CURRENT_TIMESTAMP,NULL,NULL, 0);

-- CFG_CANALE_PAGAMENTO

INSERT INTO CFG_CANALE_PAGAMENTO
(`ID`,`BUNDLE_KEY`,`DESCRIZIONE`,`ST_RIGA`,`OP_INSERIMENTO`,`TS_INSERIMENTO`,`OP_AGGIORNAMENTO`,`TS_AGGIORNAMENTO`,`VERSION`) VALUES 
( 14,'PSP','PSP', 'V', 'SCRIPT', CURRENT_TIMESTAMP, NULL, NULL, 0);

-- CFG_MODALITA_PAGAMENTO

INSERT INTO CFG_MODALITA_PAGAMENTO
(`ID`,`BUNDLE_KEY`,`DESCRIZIONE`,`ST_RIGA`, `OP_INSERIMENTO`, `TS_INSERIMENTO`, `OP_AGGIORNAMENTO`, `TS_AGGIORNAMENTO`,`VERSION`, `PAYMENT_METHOD`) VALUES
( 16, 'PSP', 'PAGAMENTO PRESSO PSP PAGOPA', 'V', 'SCRIPT', CURRENT_TIMESTAMP, NULL, NULL, 0, 0);

-- CFG_GATEWAY_PAGAMENTO

INSERT INTO CFG_GATEWAY_PAGAMENTO (BUNDLE_KEY,ID_CFG_MODALITA_PAGAMENTO,ID_CFG_STRUMENTO_PAGAMENTO,ID_CFG_DOCUMENTO_PAGAMENTO,ID_CFG_CANALE_PAGAMENTO,ID_CFG_FORNITORE_GATEWAY,DESCRIZIONE,DESC_GATEWAY,STATO,DATA_INIZIO_VALIDITA,DATA_FINE_VALIDITA,SYSTEM_ID,APPLICATION_ID,APPLICATION_IP,MOLTEPLICITA,MAX_IMPORTO,TIMEOUT,TIMEOUT_AUP,TIMEOUT_NP,ST_RIGA,OP_INSERIMENTO,TS_INSERIMENTO,OP_AGGIORNAMENTO,TS_AGGIORNAMENTO,VERSION,DATA_PUBBLICAZIONE,SYSTEM_NAME,SUBSYSTEM_ID,PRIORITA,DISPONIBILITA_SERVIZIO,OP_ANNULLAMENTO,TS_ANNULLAMENTO,URL_INFO_PSP,URL_INFO_CANALE,FLAG_MOD_RIVERSAMENTO,ID_CONTOTECNICO,FLAG_REND_RIVERSAMENTO,MODELLO_VERSAMENTO,FL_STORNO_GESTITO,TIPO_VERSAMENTO,ACL,FL_MDB_GESTITO)  VALUES 
('DEFAULT3XXX-00000000000_01-PO',16,null,null,14,4,'PSP Default Modello 3','PSP Default Modello 3','ATTIVO',CURRENT_TIMESTAMP,{ts '2099-02-01 00:00:00'},'DEFAULT3XXX','00000000000_01-PO',null,'1',null,null,null,null,'V','SCRIPT',CURRENT_TIMESTAMP,null,null,0,CURRENT_TIMESTAMP,'PSP Default Modello 3','00000000000','1','Sempre disponibile',null,null,null,null,'D',null,'1','4','N','PO',null,'0');


-- ------------------------------------------------------------------------------
INSERT INTO APPLICATION_INFO
	(PRODUCT_NAME,PRODUCT_DB_VERSION,TS_AGGIORNAMENTO,VERSION)
VALUES (
	'INIT.DATA',
	'paytas.init.data',
	CURRENT_TIMESTAMP,
	20                  
);

COMMIT;
