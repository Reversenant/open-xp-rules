# Здесь укажи какие нормализованные события (одно или несколько) ты подаешь на вход правилу корреляции.
# События отделяются друг от друга символом новой строки. Каждое их них должно быть записано в строку.
{"body":"{\"schema_version\":1,\"mach_time\":80104564567,\"event_type\":32,\"thread\":{\"thread_id\":18065},\"version\":7,\"seq_num\":1,\"event\":{\"unlink\":{\"target\":{\"path\":\"/Users/user/Desktop/CorelDRAW\",\"stat\":{\"st_blocks\":1432,\"st_blksize\":4096,\"st_rdev\":0,\"st_dev\":16777234,\"st_uid\":501,\"st_gid\":20,\"st_ino\":553421,\"st_birthtimespec\":\"2022-03-23T12:37:52.000000000Z\",\"st_flags\":0,\"st_nlink\":1,\"st_mtimespec\":\"2022-03-23T12:37:52.000000000Z\",\"st_ctimespec\":\"2024-03-12T14:04:49.876911085Z\",\"st_size\":730896,\"st_gen\":0,\"st_mode\":33277,\"st_atimespec\":\"2024-03-12T14:05:20.063685371Z\"},\"path_truncated\":false},\"parent_dir\":{\"path\":\"/Users/user/Desktop\",\"stat\":{\"st_blocks\":0,\"st_blksize\":4096,\"st_rdev\":0,\"st_dev\":16777234,\"st_uid\":501,\"st_gid\":20,\"st_ino\":21685,\"st_birthtimespec\":\"2023-07-11T09:26:21.000000000Z\",\"st_flags\":0,\"st_nlink\":14,\"st_mtimespec\":\"2024-03-12T14:05:10.302624666Z\",\"st_ctimespec\":\"2024-03-12T14:05:10.302624666Z\",\"st_size\":448,\"st_gen\":0,\"st_mode\":16832,\"st_atimespec\":\"2024-03-12T14:05:10.315544602Z\"},\"path_truncated\":false}}},\"time\":\"2024-03-12T14:05:20.233015955Z\",\"action\":{\"result\":{\"result\":{\"auth\":0},\"result_type\":0}},\"process\":{\"signing_id\":\"mac_g-55554944f9d2f6db7ac23aaea93cad4f3d707ec4\",\"parent_audit_token\":{\"asid\":100003,\"pidversion\":1136,\"ruid\":501,\"euid\":501,\"rgid\":20,\"auid\":501,\"egid\":20,\"pid\":469},\"codesigning_flags\":570425347,\"executable\":{\"path\":\"/Users/user/Desktop/CorelDRAW\",\"stat\":{\"st_blocks\":1432,\"st_blksize\":4096,\"st_rdev\":0,\"st_dev\":16777234,\"st_uid\":501,\"st_gid\":20,\"st_ino\":553421,\"st_birthtimespec\":\"2022-03-23T12:37:52.000000000Z\",\"st_flags\":0,\"st_nlink\":1,\"st_mtimespec\":\"2022-03-23T12:37:52.000000000Z\",\"st_ctimespec\":\"2024-03-12T14:04:49.876911085Z\",\"st_size\":730896,\"st_gen\":0,\"st_mode\":33277,\"st_atimespec\":\"2024-03-12T14:05:20.063685371Z\"},\"path_truncated\":false},\"ppid\":469,\"tty\":{\"path\":\"/dev/ttys000\",\"stat\":{\"st_blocks\":0,\"st_blksize\":65536,\"st_rdev\":268435456,\"st_dev\":1910549283,\"st_uid\":501,\"st_gid\":4,\"st_ino\":1197,\"st_birthtimespec\":\"1970-01-01T00:00:00.000000000Z\",\"st_flags\":0,\"st_nlink\":1,\"st_mtimespec\":\"2024-03-12T14:05:20.228653000Z\",\"st_ctimespec\":\"2024-03-12T14:05:20.228653000Z\",\"st_size\":0,\"st_gen\":0,\"st_mode\":8592,\"st_atimespec\":\"2024-03-12T14:05:20.038363000Z\"},\"path_truncated\":false},\"start_time\":\"2024-03-12T14:05:20.049243Z\",\"is_platform_binary\":false,\"group_id\":1281,\"audit_token\":{\"asid\":100003,\"pidversion\":2782,\"ruid\":501,\"euid\":501,\"rgid\":20,\"auid\":501,\"egid\":20,\"pid\":1281},\"is_es_client\":false,\"responsible_audit_token\":{\"asid\":100003,\"pidversion\":943,\"ruid\":501,\"euid\":501,\"rgid\":20,\"auid\":501,\"egid\":20,\"pid\":398},\"session_id\":461,\"original_ppid\":469,\"cdhash\":\"69051425DFC9405E7130968AD471CA578F39BF55\",\"team_id\":null},\"action_type\":1,\"global_seq_num\":107}","recv_ipv4":"127.0.0.1","recv_time":"2024-06-28T18:25:54.970Z","task_id":"00000000-0000-0000-0000-000000000000","tag":"some_tag","mime":"application/json","normalized":false,"input_id":"00000000-0000-0000-0000-000000000000","type":"raw","uuid":"8af0272c-4382-453e-a06f-25578545880c"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 {"correlation_name":"MacOS_Detection_Self_Deleting_File"}