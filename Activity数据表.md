+ ACT_RE_*:
>��RE����ʾrepository(�洢)��RepositoryService�ӿ��������ı�����ǰ׺�ı�������Ǿ�̬��Ϣ��
>�磬���̶��壬���̵���Դ��ͼƬ������ȣ���

+ ACT_RU_*:
>��RU����ʾruntime������ʱ��-RuntimeService����������ʱ�ı�洢�����̱������û����񣬱�����ְ��job��������ʱ�����ݡ�
>Activitiֻ�洢ʵ��ִ���ڼ������ʱ���ݣ�������ʵ������ʱ����ɾ����Щ��¼����ͱ�֤����Щ����ʱ�ı�С�ҿ졣

+ ACT_ID_*:
>��ID����ʾidentity (��֯����)��IdentityService�ӿ��������ı��û���¼��������ʹ�õ����û����顣��Щ�������ʶ����Ϣ��
>���û����û��飬�ȵȡ�

+ ACT_HI_*:
>��HI����ʾhistory����ʷ���ݱ�HistoryService��������Щ�����������ִ�е���ʷ������ݣ������������ʵ�������������񣬵ȵ�

+ ACT_GE_*:
>ȫ��ͨ�����ݼ�����(general)�����������ʹ�õ����� 


| ��� | ����   | ˵��
| ----- | --------- | ----------- 
| 1  |	act_ge_bytearray | 	���������ݱ� |
| 2  |	act_ge_property | 	�������ݱ�洢�����������漶�������,��ʼ����ṹʱ����Ĭ�ϲ���������¼�� |
| 3  |	act_hi_actinst | 	��ʷ�ڵ�� |
| 4  |	act_hi_attachment | 	��ʷ������ |
| 5  |	act_hi_comment | 	��ʷ����� |
| 6  |	act_hi_identitylink | 	��ʷ������Ա�� |
| 7  |	act_hi_detail | 	��ʷ������ṩ��ʷ�����Ĳ�ѯ |
| 8  |	act_hi_procinst | 	��ʷ����ʵ���� |
| 9  |	act_hi_taskinst | 	��ʷ����ʵ���� |
| 10  |	act_hi_varinst | 	��ʷ������ |
| 11  |	act_id_group | 	�û�����Ϣ�� |
| 12  |	act_id_info | 	�û���չ��Ϣ�� |
| 13  |	act_id_membership | 	�û����û����Ӧ��Ϣ�� |
| 14  |	act_id_user | 	�û���Ϣ�� |
| 15  |	act_re_deployment | 	������Ϣ�� |
| 16  |	act_re_model | 	�������ģ�Ͳ���� |
| 17  |	act_re_procdef | 	���̶������ݱ� |
| 18  |	act_ru_event_subscr | 	throwEvent��catchEventʱ�������Ϣ�� |
| 19  |	act_ru_execution | 	����ʱ����ִ��ʵ���� |
| 20  |	act_ru_identitylink | 	����ʱ������Ա����Ҫ�洢����ڵ�������ߵ������Ϣ |
| 21  |	act_ru_job | 	����ʱ��ʱ�������ݱ� |
| 22  |	act_ru_task | 	����ʱ����ڵ�� |
| 23  |	act_ru_variable | 	����ʱ���̱������ݱ� |

#�����
+ ���������ݱ�act_ge_bytearray��
>�������̶���ͼƬ��xml��Serializable(���л�)�ı���,���������ж��������ݣ��ر�ע����·������ʱ�򣬲�Ҫ��svn�������ļ����������������޹ص��ļ�Ҳһ���𵽸ñ��У������һЩ���󣨿��ܵ������̶����޷�ɾ����

| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
| ID_ | 	ID_	| nvarchar(64) | 	Y	| |  	����ID | 
| REV_ | 	�ֹ��� | 	int	 | 	| Y |	Version(�汾) | 
| NAME_ | 	���� | 	nvarchar(255) |	|  	Y|	������ļ����ƣ��磺leave.bpmn.png,leave.bpmn20.xml | 
| DEPLOYMENT_ID_ | 	����ID|	nvarchar(64) |	 | 	Y|	�����ID | 
| BYTES_ | 	�ֽ� | 	varbinary(max)	|  | 	Y | 	�����ļ� | 
| GENERATED_ | 	�Ƿ����������� | 	tinyint |  |	 	Y | 	0Ϊ�û����ɣ�1Ϊactiviti���� | 

+ �������ݱ�(act_ge_property)
>�������ݱ��洢�����������漶������ݡ�

| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
|  NAME_ |	���� |	nvarchar(64) |	��	 | | 	schema.versionschema.historynext.dbid |
| VALUE_ |	ֵ |	nvarchar(300)	 | | 	��	 |5.create(5.) |
| REV_	 | �ֹ���  |	int  | |	 	��	 |version |
 
 
+ ��ʷ�ڵ��act_hi_actinst��
>��ʷ���Ϣ�������¼������ת�������нڵ㣬��HI_TASKINST��ͬ���ǣ�taskinstֻ��¼usertask����
 
 | �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
 | -----    | ---------   | --------- |---------|-------|------|
|  ID_	 | ID_  |	nvarchar(64) |	��	  | |	  |
 | PROC_DEF_ID_  |	���̶���ID	 | nvarchar(64)  | | |	 	 	  |
 | PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) | | |	 	 	  |
 | EXECUTION_ID_ |	ִ��ʵ��ID |	nvarchar(64)	 | | | 	 	 | 
 | ACT_ID_	 | �ڵ�ID |	nvarchar(225)  | |	 | 	 	�ڵ㶨��ID |
 | TASK_ID_  |	����ʵ��ID |	nvarchar(64) | |	 	��	 | ����ʵ��ID �����ڵ�����ʵ��ID������Ϊ�� |
 | CALL_PROC_INST_ID_	 |�����ⲿ������ʵ��ID |	nvarchar(64) |	| 	��	 | �����ⲿ���̵�����ʵ��ID' |
|  ACT_NAME_ |	�ڵ����� |	nvarchar(225) |	 | 	��	 |�ڵ㶨������ |
 | ACT_TYPE_ |	�ڵ����� |	nvarchar(225) |	  |	 	 |��startEvent��userTask |
 | ASSIGNEE_ |	ǩ���� |	nvarchar(64) |	  |	��	 |�ڵ�ǩ���� |
 | START_TIME_ |	��ʼʱ�� |	datetime |	  |	 	 |2013-09-15 11:30:00 |
 | END_TIME_ |	����ʱ�� |	datetime |	  |	��	 |2013-09-15 11:30:00 |
 | DURATION_ |	��ʱ |	numeric(19,0) |	  |	��	 |����ֵ |
 
 
+ ��ʷ������( act_hi_attachment )
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_ |	nvarchar(64) | 	��	 | 	 |����ID |
 | REV_	 |�ֹ��� |	integer	 | | 	��	 |Version |
 | USER_ID_	 |�û�ID |	nvarchar(255) | |	 	��	 |�û�ID |
 | NAME_	 |����	 |nvarchar(255)	  | |	��	 |�������� |
 | DESCRIPTION_ |	����	 | nvarchar(4000) | |	 	��	 |���� |
 | TYPE_ |	����	 |nvarchar(255)	  | |	��	 |�������� |
 | TASK_ID_ |	����ʵ��ID |	nvarchar(64) | |	 	��	 |�ڵ�ʵ��ID |
 | PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) | |	 	��	 |����ʵ��ID |
 | URL_	 |URL_ |	nvarchar(4000)	 | | 	��	 |������ַ |
 | CONTENT_ID_ |	�ֽڱ��ID	 |nvarchar(64) | |	 	��	 |ACT_GE_BYTEARRAY��ID |
 
+ ��ʷ�����( act_hi_comment )
 
 | �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
 | -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_	 | nvarchar(64) |	��	 | | 	����ID |
 | TYPE_ |	���� |	nvarchar(255) |	  |	�� |	���ͣ�event���¼���comment������� |
 | TIME_ |	ʱ�� |	datetime |	  | |	 	��дʱ��' |
 | USER_ID_ |	�û�ID |	nvarchar(64) |	  |	�� |	��д�� |
 | TASK_ID_	 |�ڵ�����ID |	nvarchar(64) |	 | 	�� |	�ڵ�ʵ��ID |
 | PROC_INST_ID_ |	����ʵ��ID |	nvarchar(255) |	  |	�� |	����ʵ��ID |
 | ACTION_ |	��Ϊ���� |	nvarchar(64) |	  |	�� |	����ע1 |
 | MESSAGE_ |	�������� |	nvarchar(4000) |	  |	�� |	���ڴ�����̲�������Ϣ������������� |
 | FULL_MSG_ |	ȫ������ |	varbinary(max) |	 | 	�� |	������ַ |

+ ��ʷ�����( act_hi_detail )
>�����в����ı�����ϸ����������������ת�ı�����ҵ�������д��������Ҫ�õ��ı����ȡ�
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_	 |ID_	 | nvarchar(64) |	�� |  |	 	���� |
 | TYPE_ |	���� |	nvarchar(255) |	  | |	 	����ע2 |
 | PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) |	  |	�� |	����ʵ��ID |
 | EXECUTION_ID_ |	ִ��ʵ��ID |	nvarchar(64) |	  |	�� |	ִ��ʵ��ID |
 | TASK_ID_ |	����ʵ��ID |	nvarchar(64) |	  |	�� |	����ʵ��ID |
 | ACT_INST_ID_ |	�ڵ�ʵ��ID |	nvarchar(64) |	  |	�� |	ACT_HI_ACTINST���ID |
 | NAME_ |	���� |	nvarchar(255) |	  | |	 	���� |
 | VAR_TYPE_ |	�������� |	nvarchar(255) |	 	 |��	 |����ע3 |
 | REV_ |	�ֹ��� |	int	 |  |	�� |	Version |
 | TIME_ |	ʱ��� |	datetime |	  | |	 	����ʱ�� |
 | BYTEARRAY_ID_ |	�ֽڱ�ID |	nvarchar |	  |	�� |	ACT_GE_BYTEARRAY���ID |
 | DOUBLE_ |	DOUBLE_	 |double precision |	 | 	�� |	�洢��������ΪDouble |
 | LONG_ |	LONG_ |	numeric |	  |	�� |	�洢��������Ϊlong |
 | TEXT_ |	TEXT_ |	nvarchar |	  |	��	 |�洢����ֵ����ΪString |
 | TEXT2_ |	TEXT2_ |	nvarchar |	  |	�� |	�˴��洢����JPA�־û�����ʱ���Ż���ֵ����ֵΪ����ID |
 
+ ��ʷ������Ա��( act_ru_identitylink )
> ������������ݱ���Ҫ�洢��ʷ�ڵ�����ߵ���Ϣ
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_	 |nvarchar(64)	 |��	  | |	ID_ |
 | GROUP_ID_ |	��ID |	nvarchar(255) |	 | 	�� |	��ID |
 | TYPE_ |	���� |	nvarchar(255)	 | 	 |�� |	��ע4 |
 | USER_ID_ |	�û�ID |	nvarchar(255) |	  |	�� |	�û�ID |
 | TASK_ID_ |	�ڵ�ʵ��ID |	nvarchar(64) |	  |	�� |	�ڵ�ʵ��ID |
 | PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64)	 | | 	�� |	����ʵ��ID |
 
+ ��ʷ����ʵ����act_hi_procinst��
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_	 | ID_ |	nvarchar(64) |	��	 | | 	����ID |
 | PROC_INST_ID_ |	����ʵ��ID	 |nvarchar(64)	 | | | 	 	����ʵ��ID |
 | BUSINESS_KEY_ |	ҵ������ |	nvarchar(255) |	  |	�� |	ҵ��������ҵ�����ID |
 | PROC_DEF_ID_ |	���̶���ID	 |nvarchar(64)	 | 	 | | 	���̶���ID |
 | START_TIME_	 |��ʼʱ��	 |datetime	 | 	  | |	��ʼʱ�� |
 | END_TIME_ |	����ʱ�� |	datetime	 | 	 |��	 |����ʱ�� |
|  DURATION_	 |��ʱ |	Numeric(19)	  | |	�� |	��ʱ |
 | START_USER_ID_ |	����� |	nvarchar(255)	 | 	 |�� |	����� |
 | START_ACT_ID_ |	��ʼ�ڵ�ID |	nvarchar(255) |	 	 |��	 |��ݻ���ID |
 | END_ACT_ID_ |	�����ڵ�ID |	nvarchar(255)	 | 	 |�� |	��������ID |
 | SUPER_PROCESS_INSTANCE_ID_ |	������ʵ��ID	 |nvarchar(64) |	  |	�� |	������ʵ��ID |
 | DELETE_REASON_ |	ɾ��ԭ�� |	nvarchar(4000) |	  |	�� |	ɾ��ԭ�� |

+ ��ʷ����ʵ����( act_hi_taskinst )
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_ |	nvarchar(64) |	��	 |  |	����ID |
 | PROC_DEF_ID_ |	���̶���ID |	nvarchar(64)	 | | 	�� |	���̶���ID |
 | TASK_DEF_KEY_ |	�ڵ㶨��ID |	nvarchar(255) |	 | 	�� |	�ڵ㶨��ID |
|  PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64)	 | | 	�� |	����ʵ��ID |
|  EXECUTION_ID_ |	ִ��ʵ��ID |	nvarchar(64)	 | | 	�� |	ִ��ʵ��ID |
 | NAME_	 |���� |	varchar(255) |	  |	�� |	���� |
 | PARENT_TASK_ID_ |	���ڵ�ʵ��ID	 |nvarchar(64) | |	 	��	 |���ڵ�ʵ��ID |
 | DESCRIPTION_	 |���� |	nvarchar(400) |	 | 	�� |	���� |
 | OWNER_ |	ʵ��ǩ���� �����ӵ���� |	nvarchar(255) |	  |	�� |	ǩ���ˣ�Ĭ��Ϊ�գ�ֻ����ί��ʱ����ֵ�� |
 | ASSIGNEE_ |	ǩ���˻�ί�� |	nvarchar(255) |	 | 	�� |	ǩ���˻�ί�� |
 | START_TIME_ |	��ʼʱ�� |	datetime	 | | 	  |	��ʼʱ�� |
 | CLAIM_TIME_ |	����ʱ�� |	datetime	 | | 	�� |	����ʱ�� |
 | END_TIME_	 |����ʱ�� |	datetime	 | | 	�� |	����ʱ�� |
 | DURATION_ |	��ʱ |	numeric(19)	  | |	�� |	��ʱ |
 | DELETE_REASON_ |	ɾ��ԭ�� |	nvarchar(4000) | |	 	�� |	ɾ��ԭ��(completed,deleted) |
 | PRIORITY_	 |���ȼ��� |	int	 |  |	�� |	���ȼ��� |
 | DUE_DATE_ |	����ʱ�� |	datetime	 | | 	�� |	����ʱ�䣬��������Ӧ�ڶ೤ʱ������� |
 | FORM_KEY_	 |�ڵ㶨���formkey |	nvarchar(255) | |	 	�� |	desinger�ڵ㶨���form_key���� |
 
+ ��ʷ������( act_hi_varinst )
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_ |	nvarchar(64) |	��	 	 | |ID_ |
 | PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) |	 | 	��	 |����ʵ��ID |
 | EXECUTION_ID_ |	ִ��ʵ��ID	 |nvarchar(255)	 |  |	��	 |ִ��ʵ��ID |
 | TASK_ID_ |	����ʵ��ID |	nvarchar(64) |	 	 |��	 |����ʵ��ID |
 | NAME_	 |���� |	nvarchar(64)	 | 	  |	 |��������(Ӣ��) |
 | VAR_TYPE_ |	��������	 |varchar(255) | |	 	��	 |��ע5 |
 | REV_	 |�ֹ��� |	nvarchar(64) |	  |	��	 |�ֹ��� Version |
 | BYTEARRAY_ID_ |	�ֽڱ�ID |	nvarchar(400) |	 | 	��	 |ACT_GE_BYTEARRAY������� |
 | DOUBLE_ |	DOUBLE_ |	nvarchar(255)	 | | 	��	 |�洢DoubleType���͵����� |
 | LONG_ |	LONG_ |	nvarchar(255) |	 	 |��	 |�洢LongType���͵����� |
 | TEXT_ |	TEXT_ |	datetime	 | | 	��	 |��ע6 |
 | TEXT2_	 |TEXT2_ |	datetime |	 | 	��	 |�˴��洢����JPA�־û�����ʱ���Ż���ֵ����ֵΪ����ID |


+ �û�����Ϣ��( act_id_group )
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_ |	nvarchar(64) |	��	  | 	 |����ID |
 | REV_ |	�ֹ��� |	int	  | |	��	 |�ֹ���Version |
|  NAME_ |	���� |	nvarchar(255) |	 | 	��	 |������ |
 | TYPE_ |	���� |	nvarchar(255) |	  |	��	 |���� |
 
 +�û���չ��Ϣ��( act_id_info )
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
|  ID_ |	ID_	 |nvarchar(64) |	��	 | | 	����ID |
|  REV_	 |�ֹ��� |	int	  | |	��	 |�ֹ���Version |
|  USER_ID_ |	�û�ID |	nvarchar(64) | |	 	�� |	 | 
|  TYPE_ |	���� |	nvarchar(64) |	 |  	�� | |	 
|  KEY_	  | |	nvarchar(255) |	 |  	�� |	  |
|  VALUE_ |	 | 	nvarchar(255) | 	 | 	�� |	  |
|  PASSWORD_ |	  |	Image |	  | 	�� |	  |
|  PARENT_ID_ |	  |	nvarchar(255) |	  | 	�� |	  |

+ �û�������Ӧ��Ϣ��( act_id_membership )
> ���������û��ķ�����Ϣ��
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
|  USER_ID |	�û�ID |	nvarchar(64) |	��	 | | 	  |
|  GROUP_ID |	�û���ID |	nvarchar(64) | |	�� | |	 	  |
 
+ �û���Ϣ��( act_id_user )

| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_ |	nvarchar(64)	 |��	 	 | |����ID |
 | REV_ |	�ֹ��� |	int	 	 | |��	 |�ֹ���Version |
|  FIRST_ |	�� |	nvarchar(255)	 | | 	��	 |  |
 | LAST_ |	�� |	nvarchar(255)	  | |	��	 |  |
 | EMAIL_ |	EMAIL_ |	nvarchar(255) | |	 	��	 |  |
 | PWD_ |	���� |	nvarchar(255)	  | |	��	 | |
 | PICTURE_ID_ |	ͼƬID |	nvarchar(64)	 | | 	��	 |  |

+ ������Ϣ��( act_re_deployment )
 >�������̶���ʱ��Ҫ���־û�������������Ϣ��
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_	 |nvarchar(64) |	�� | |	 	����ID |
 | NAME_ |	�������� |	nvarchar(255) |	  |	��	 |�����ļ��� |
 | CATEGORY_ |	���� |	nvarchar(255) |	  |	�� |	��� |
 | DEPLOY_TIME_ |	����ʱ�� |	datetime |	  |	�� |	����ʱ�� |
 
 
+ �������ģ�Ͳ����( act_re_model )
 >���������������̺󣬱������ݵ��ñ�
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_ |	nvarchar(64) |	��	 | | 	ID_ |
|  REV_ |	�ֹ���	 |int	  | |	�� |	�ֹ��� |
|  NAME_ |	���� |	nvarchar(255)	 | | 	�� |	���� |
|  KEY_	KEY_ |	 |nvarchar(255)	  | |	�� |	���࣬���磺http://www.mossle.com/docs/activiti/ |
 | CATEGORY_ |	���� |	nvarchar(255)	 | | 	�� |	���� |
|  CREATE_TIME_ |	����ʱ�� |	datetime	 | | 	��	 |����ʱ�� |
|  LAST_UPDATE_TIME_ |	�����޸�ʱ�� |	datetime	 | | 	��	 |�����޸�ʱ�� |
|  VERSION_	 |�汾	 |int	  | |	��	 |�汾 |
|  META_INFO_ |	META_INFO_	 |nvarchar(255)	  | |	��	 |��json��ʽ�������̶������Ϣ |
|  DEPLOYMENT_ID_ |	����ID	 |nvarchar(255) | |	 	��	 |����ID |
|  EDITOR_SOURCE_VALUE_ID_ |	  |	datetime	 | | 	��	 |  |
|  EDITOR_SOURCE_EXTRA_VALUE_ID_ |	  |	datetime	 | | 	��	 |  |
 
+  ���̶������ݱ�( act_re_procdef )
 >ҵ�����̶������ݱ��˱��ACT_RE_DEPLOYMENT�Ƕ��һ�Ĺ�ϵ������һ�������bar������ܰ���������̶����ļ���ÿ�����̶����ļ�������һ����¼��ACT_REPROCDEF���ڣ�ÿ�����̶�������ݣ��������ACT_GE_BYTEARRAY���ڵ�һ����Դ�ļ���PNGͼƬ�ļ�����ACT_GE_BYTEARRAY�Ĺ�����ͨ��������ACT_GE_BYTEARRAY.NAME��ACT_RE_PROCDEF.NAME_��ɵģ������ݿ��ṹ��û�����֡�
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
 | ID_ |	ID_	 |nvarchar(64) |	�� | |	 	ID_ |
 | REV_	 |�ֹ��� |	int |	  |	�� |	�ֹ��� |
 | CATEGORY_ |	���� |	nvarchar(255) |	  |	��	 |���̶����Namespace������� |
 | NAME_ |	���� |	nvarchar(255) |	 	 |��	 |���� |
 | KEY_	 |�����KEY |	nvarchar(255) |	  | |	 	���̶���ID |
 | VERSION_	 |�汾 |	int	 | 	  | |	�汾 |
|  DEPLOYMENT_ID_ |	�����ID |	nvarchar(64) | |	 	�� |	�����ID |
|  RESOURCE_NAME_	 |bpmn�ļ����� |	nvarchar(4000) | |	 	�� |	����bpmn�ļ����� |
|  DGRM_RESOURCE_NAME_ |	pngͼƬ���� |	nvarchar(4000) |	 | 	�� |	����ͼƬ���� |
|  DESCRIPTION_	 |���� |	nvarchar(4000) |	 | 	�� |	���� |
|  HAS_START_FORM_KEY_ |	�Ƿ���ڿ�ʼ�ڵ�formKey |	tinyint |	  |	�� |	start�ڵ��Ƿ����formKey 0�� 1�� |
 | SUSPENSION_STATE_ |	�Ƿ���� |	tinyint	 | | 	�� |	1 ���� 2���� |
 
 + act_ru_event_subscr
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
|  ID_	 |�¼�ID |	nvarchar(64) |	�� | |	 	�¼�ID |
|  REV_	 |�汾 |	int	  |  |	��	 |�ֹ���Version |
|  EVENT_TYPE_ |	�¼����� |	nvarchar(255) |	  | |	 	�¼����� |
 | EVENT_NAME_	 |�¼����� |	nvarchar(255)	 | 	 |��	 |�¼����� |
 | EXECUTION_ID_ |	ִ��ʵ��ID |	nvarchar(64) |	  |	�� |	ִ��ʵ��ID |
 | PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) |	  |	�� |	����ʵ��ID |
 | ACTIVITY_ID_ |	�ʵ��ID |	nvarchar(64) |	  |	�� |	�ʵ��ID |
  |CONFIGURATION_ |	����	 |nvarchar(255)	 |  |	�� |	���� |
 | CREATED_ |	�Ƿ񴴽� |	datetime |	  | |	 	Ĭ��ֵ ��ǰϵͳʱ���CURRENT_TIMESTAMP |
 
 + ����ʱ����ִ��ʵ����( act_ru_execution )

| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
|  ID_ |	ID_	 |nvarchar(64) |	��	 | | 	ID_ |
|  REV_ |	�ֹ��� |	int	  | |	��	 |�ֹ��� |
|  PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) |	  | |	 	����ʵ��ID |
|  BUSINESS_KEY_ |	ҵ������ID |	nvarchar(255) |	  |	�� |	ҵ������ID |
|  PARENT_ID_ |	���ڵ�ʵ��ID |	nvarchar(64) |	  |	�� |	���ڵ�ʵ��ID |
|  PROC_DEF_ID_	 |���̶���ID |	nvarchar(64) |	  |	��	 |���̶���ID |
|  SUPER_EXEC_ |	SUPER_EXEC_ |	nvarchar(64) |	  |	��	 |SUPER_EXEC_ |
|  ACT_ID_ |	�ڵ�ʵ��ID |	nvarchar(255) |	  |	�� |	�ڵ�ʵ��ID��ACT_HI_ACTINST��ID |
|  IS_ACTIVE_	 |�Ƿ��� |	tinyint	 | 	 |�� |	�Ƿ��� |
|  IS_CONCURRENT_ |	�Ƿ��� |	tinyint	 |  |	��	 |�Ƿ�Ϊ����(true/false�� |
|  IS_SCOPE_ |	IS_SCOPE_ |	tinyint |	  |	�� |	IS_SCOPE_ |
|  IS_EVENT_SCOPE_	 |IS_EVENT_SCOPE_ |	tinyint	 |  |	�� |	IS_EVENT_SCOPE_ |
|  SUSPENSION_STATE_ |	�Ƿ���� |	tinyint	  |	 |�� |	����״̬ 1���� 2���� |
|  CACHED_ENT_STATE_ |	  |	int	 | 	 |��	 |  |
 
+  ����ʱ������Ա��( act_ru_identitylink )
>������������ݱ���Ҫ�洢��ǰ�ڵ�����ߵ���Ϣ��
 
| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
|  ID_ |	ID_	 |nvarchar(64) |	�� | |	 	ID_ |
|  REV_ |	�ֹ���	 |int	 | 	 |��	 |�ֹ��� |
|  GROUP_ID_ |	��ID |	nvarchar(64) |	 | 	��	 |��ID |
|  TYPE_ |	����	 |nvarchar(255)	  | |	�� |	��ע7 |
|  USER_ID_	 |�û�ID |	nvarchar(64) |	  |	�� |	�û�ID |
|  TASK_ID_	 |�ڵ�ʵ��ID |	nvarchar(64) |	  |	��	 |�ڵ�ʵ��ID |
|  PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) |	  |	�� |	����ʵ��ID |
|  PROC_DEF_ID_	 |���̶���ID |	nvarchar(255) |	 	 |��	 |���̶���ID |

+  ����ʱ��ʱ�������ݱ�( act_ru_job )

| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
|  ID_	 |��ʶ	 |nvarchar(64) |	 ��	 | | 	��ʶ |
|  REV_	 |�汾 |	int	  |	 |��	 |�汾 |
|  TYPE_ |	���� |	nvarchar(255) |	  | |	 	���� |
|  LOCK_EXP_TIME_ |	�����ͷ�ʱ��	 |datetime	 |  |	�� |	�����ͷ�ʱ�� |
|  LOCK_OWNER_ |	������ |	nvarchar(255)	 |  |	�� |	������ |
|  EXCLUSIVE_	 | | 	bit	 |  |	�� |	  |
|  EXECUTION_ID_ |	ִ��ʵ��ID |	nvarchar(64) | |	 	�� |	ִ��ʵ��ID |
|  PROCESS_INSTANCE_ID_ |	����ʵ��ID |	nvarchar(64) |	  |	��	 |����ʵ��ID |
|  PROC_DEF_ID_	 |���̶���ID |	nvarchar(64)	 | | 	�� |	���̶���ID |
|  RETRIES_	  |	 |int	 |  |	�� |	  |
|  EXCEPTION_STACK_ID_	 |�쳣��ϢID |	nvarchar(64) |	  |	��	 |�쳣��ϢID |
|  EXCEPTION_MSG_ |	�쳣��Ϣ	 |nvarchar(4000)	 | 	 |�� |	�쳣��Ϣ |
|  DUEDATE_ |	����ʱ�� |	datetime |	  |	��	 |����ʱ�� |
|  REPEAT_	 |�ظ�	 |nvarchar(255)	 |  |	�� |	�ظ� |
|  HANDLER_TYPE_ |	�������� |	nvarchar(255) |	  |	�� |	�������� |
|  HANDLER_CFG_	  | |	nvarchar(4000)	 | | 	�� |	��ʶ |
 
+  ����ʱ����ڵ��( act_ru_task )

| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
| ID_ |	ID_ |	nvarchar(64) |	��	 | | 	ID_ |
|  REV_ |	�ֹ��� |	int	 |  |	�� |	�ֹ��� |
|  EXECUTION_ID_ |	ִ��ʵ��ID |	nvarchar(64) |	  |	�� |	ִ��ʵ��ID |
|  PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) |	 | 	�� |	����ʵ��ID |
|  PROC_DEF_ID_ |	���̶���ID |	nvarchar(64) |	  |	�� |	���̶���ID |
|  NAME_	 |�ڵ㶨������ |	nvarchar(255)	 |  |	�� |	�ڵ㶨������ |
|  PARENT_TASK_ID_	 |���ڵ�ʵ��ID |	nvarchar(64) |	  |	�� |	���ڵ�ʵ��ID |
|  DESCRIPTION_	 |�ڵ㶨������ |	nvarchar(4000) |	 | 	�� |	�ڵ㶨������ |
|  TASK_DEF_KEY_ |	�ڵ㶨���KEY |	nvarchar(255) |	  |	�� |	�������ID |
|  OWNER_	 |ʵ��ǩ���� |	nvarchar(255) |	 | 	�� |	ӵ���ߣ�һ�������Ϊ�գ�ֻ����ί��ʱ����ֵ�� |
|  ASSIGNEE_ |	ǩ���˻�ί���� |	nvarchar(255) |	  |	�� |	ǩ���˻�ί���� |
|  DELEGATION_	 |ί������	 |nvarchar(64) |	  |	�� |	��ע8 |
|  PRIORITY_	 |���ȼ��� |	int	 |  |	�� |	���ȼ���Ĭ��Ϊ��50  |
|  CREATE_TIME_ |	����ʱ�� |	datetime |	 	 |�� |	����ʱ�� |
|  DUE_DATE_ |	����ʱ�� |	datetime	 | 	 |��	 |��ʱ |
|  SUSPENSION_STATE_ |	�Ƿ���� |	int	 | | 	�� |	1������ 2������� |

+  ����ʱ���̱������ݱ�( act_ru_variable )

| �ֶ����� |	�ֶ����� |	�������� |	���� |	Ϊ�� |	ȡֵ˵�� |
| -----    | ---------   | --------- |---------|-------|------|
| ID_	 |ID_ |	nvarchar(64) |	��	 | | 	������ʶ  |
|  REV_	 |�ֹ��� |	int	  |	 |�� |	�ֹ��� |
|  TYPE_ |	���� |	nvarchar(255) |	  | |	 	��ע9 |
|  NAME_ |	����	 |nvarchar(255)	 | 	  | |	�������� |
|  EXECUTION_ID_ |	ִ��ʵ��ID	 |nvarchar(64)	  |	 |�� |	ִ�е�ID |
|  PROC_INST_ID_ |	����ʵ��ID |	nvarchar(64) |	  |	�� |	����ʵ��ID |
|  TASK_ID_	 |�ڵ�ʵ��ID	 |nvarchar(64)	  |	 |��	 |�ڵ�ʵ��ID(Local�� | 
|  BYTEARRAY_ID_ |	�ֽڱ�ID |	nvarchar(64) |	  |	�� |	�ֽڱ��ID��ACT_GE_BYTEARRAY�� | 
|  DOUBLE_	 |DOUBLE_ |	float	 |  |	�� |	�洢��������ΪDouble | 
|  LONG_	 |LONG_ |	numeric(19) |	 	 |�� |	�洢��������Ϊlong | 
|  TEXT_	 |TEXT_	 |nvarchar(4000) |	 	 |�� |	'�洢����ֵ����ΪString ��˴��洢�־û�����ʱ��ֵjpa�����class | 
|  TEXT2_	 |TEXT2_ |	nvarchar(4000)	  | |	�� |	�˴��洢����JPA�־û�����ʱ���Ż���ֵ����ֵΪ����ID | 