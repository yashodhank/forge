import groovy.json.JsonSlurper

parsed_args = new JsonSlurper().parseText(args)

security.setAnonymousAccess(false)
log.info('Anonymous access disabled')

security.securitySystem.changePassword('admin', parsed_args.admin_password)
log.info('default password for admin changed')
