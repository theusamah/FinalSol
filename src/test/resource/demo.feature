

#Feature: Login page


#    Scenario: User opens browser

 #       Given user enters above url https://acme-qa.everreal.co/
 #       When  user enters username & password
 #       Then  user enters username & password


Feature: LoginFeature

    Scenario: User logs in with correct credentials

        Given user opens application
        When  user enters username and password
        Then  user logs in successfully




#Feature: Set an appointment
#    Scenario: User selects a time slot
#
#        Given user is invited to schedule a visit
#        When  user selects a time slot
#        And   clicks save
#        Then  user sets his appointment
#
#
#
#Feature: Appointment Deletion
#
#    Scenario: User deletes his appointment
#
#        Given user has already saved an appointment
#        When  user clicks on bin icon
#        Then  user deletes his current appointment
#
#

