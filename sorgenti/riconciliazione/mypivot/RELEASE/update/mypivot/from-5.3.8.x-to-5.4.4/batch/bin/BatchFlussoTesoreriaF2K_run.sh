#!/bin/sh

export JAVA_HOME="__TAG_BATCH_JAVA_HOME_PATH__"
export ROOT_TALEND="__TAG_BATCH_ROOT_PATH__"
export JAVA="$JAVA_HOME/bin/java"
export ROOT_PATH="$ROOT_TALEND/jobs/BatchFlussoTesoreriaF2K/Main_Manage_Flusso_Tesoreria_F2K"

cd $ROOT_PATH

$JAVA -DHOSTNAME=$HOSTNAME -Xmx1024M -cp $ROOT_PATH/*:$ROOT_PATH/../lib/* manage_flusso_tesoreria_f2k.main_manage_flusso_tesoreria_f2k_0_1.Main_Manage_Flusso_Tesoreria_F2K --context_param directory_talend=$ROOT_TALEND 
