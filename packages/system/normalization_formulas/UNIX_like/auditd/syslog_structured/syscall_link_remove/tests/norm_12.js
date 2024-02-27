{
  "subject": "account",
  "action": "remove",
  "object": "file_object",
  "status": "success",
  "category.generic": "File System Object",
  "category.high": "System Management",
  "category.low": "Manipulation",
  "chain_id": "33823044",
  "datafield1": "rm",
  "datafield2": "devops",
  "datafield3": "0700",
  "event_src.category": "Operating system",
  "event_src.ip": "10.0.223.21",
  "event_src.rule": "pt_siem_home_access",
  "event_src.subsys": "auditd",
  "event_src.title": "unix_like",
  "id": "PT_UNIX_like_auditd_syslog_structured_syscall_link_remove",
  "importance": "low",
  "labels": "node_contains_ext_ip",
  "msgid": "unlinkat",
  "numfield2": 1005,
  "object.account.group": "devops",
  "object.account.id": "1005",
  "object.account.name": "devops",
  "object.id": "1823937",
  "object.path": "/home/devops/.ansible/tmp/",
  "object.type": "directory",
  "subject.account.id": "1005",
  "subject.account.name": "devops",
  "subject.account.privileges": "1005",
  "subject.account.session_id": "33509",
  "subject.process.cwd": "/home/devops",
  "subject.process.fullpath": "/bin/rm",
  "subject.process.id": "25487",
  "subject.process.meta": "rm -f -r /home/devops/.ansible/tmp/ansible-tmp-1654261965.53422-1003-176933503040384/",
  "subject.process.name": "rm",
  "subject.process.parent.id": "25486",
  "subject.process.path": "/bin/",
  "time": "2022-06-03T13:12:59.000Z"
}