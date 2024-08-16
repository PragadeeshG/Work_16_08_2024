create table if not exists azure_cosmos_database(
cosmos_schema_code Integer not null,
master_schema_effcetive Integer null,
master_schema_effcetive_date varchar(255) null,
master_shema_size varchar(255) null,
master_schema_db_stat varchar(255) null,
user_schema_size Integer null,
user_schema_db_stat varchar(255) null,
data_constraints varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint azure_cosmos_database_pk primary key(cosmos_schema_code));