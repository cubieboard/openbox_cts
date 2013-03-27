@echo off
set CTS_ROOT=..\..
rem set RDBG_FLAG=-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=0 
set CTS_LIB=%CTS_ROOT%\android-cts\tools\cts-tradefed.jar
set DDM_LIB=%CTS_ROOT%\android-cts\tools\ddmlib-prebuilt.jar
set TDF_LIB=%CTS_ROOT%\android-cts\tools\tradefed-prebuilt.jar
set HST_LIB=%CTS_ROOT%\android-cts\tools\hosttestlib.jar
set JARS=%CTS_LIB%;%DDM_LIB%;%TDF_LIB%;%HST_LIB%
rem echo java %RDBG_FLAG% -cp %JARS% -DCTS_ROOT=%CTS_ROOT% com.android.cts.tradefed.command.CtsConsole
call java %RDBG_FLAG% -cp %JARS% -DCTS_ROOT=%CTS_ROOT% com.android.cts.tradefed.command.CtsConsole
rem pause
@echo on
