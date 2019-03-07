# TDD, BDD, and Java Oh My!
## @cecili_reid
### DevNexus 2019


Note: This Readme.md file can also be a presentation with [reveal-md|https://github.com/webpro/reveal-md]

---

## Disclaimer:
- Opinions presented are mine and mine alone and not those of my employer or any organization with which I am associated
- The examples I am going to show you are NOT production ready code 
- There will be an opportunity to later! 

Note: Bear in mind that the code illustrates how TDD/BDD can be done with Java and focuses more on the process than code. I promise I right better code than this. There are million and one ways to do this as well (hence the OPINIONATED piece). Also, there is an opportunity for a person to win a $15 lunch with me and a tour of our NCR headquarters. More details on this later.


---

## What is this about?
My opinions on when and how to use TDD and BDD whether you agree with them or not :)

---

## Practical stuff about me:
- CS degree Georgia Tech
- Ruby contractor and learned about TDD/BDD and really liked how it helped me understand business asks
- Currently at NCR where BDD was in use already

---

## Random fun stuff about me:
- proud dog mom of a shih tzu named Ceasar Megabyte Reid
- currently writing a web comic
- avid ballroom dancer
- alto saxophonist
- Toastmasters enthusiast
- lover of all food
- volunteer for many causes to leave an impact
- Ultimate life goal? Financial security to travel the world

---


## What is BDD?
Behavior driven development

Note: - Behavior driven development where behavior is often defined by business or product like your product owner in very human readable text

---

Given it was Wednesday before I went to bed
<br>
When I wake up
<br>
Then it should be Thursday
<br>
And I should put on my Thursday’s underwear

Note: This is eventually translated into code so in this case you might have a global variable of day and time when you went to bed, then you add 8 hours for your normal sleep schedule, and then check the new time for the day of the week and check that your enum of day of underwear is set to Thursday
    
---
    
## What is TDD?
Test driven development

Note: Implement tests first before implementing logic. This involves going from red failing tests with unimplemented logic to passing green tests by incrementally changing logic of your application

---

What is my official opinion?

Note: They should be combined as they offer a few benefits I found helpful. This is also unique to Java as BDD framework I use, Cucumber, was developed mainly with Ruby apps

---

## Why?
1. Benefit of incremental changes
2. Confirm understanding of happy path and edge cases first
3. Confidence in tests
4. New perspective/mindset including code reviews
5. TDD is easier with BDD
6. Scenarios are easier to understand for integration tests
7. 95% Code coverage means nothing if your tests are flawed

Note: 1.ensure your code has no affect anywhere else consistently and easier to do with incremental changes. Let's be agile! 2. The simple exercise has shown sometimes devs and business weren't aligned like we thought. 3. Writing my test to fail first with expected testing that user's will do, gives me a vote of confidence that the logic I write is fairly on point AND matches what business wants 4.Practicing TDD with BDD helped me hone my dev chops especially with error handling and edge cases and will force junior devs to do the same rather than just focus on the happy path given to us by business. This mindset is so important to me of tests matter, that I don’t even bother checking the code if the tests are flawed 5.since it is higher level concept than jUnit tests 6.building microservices integration testing from high level is much easier to grasp with BDD 7. Coverage means nothing if you don't adequately meet the scenarios desired. TDD/BDD is a great compliment to jUnit tests though to cover your bases
 
---

## Let's look at code!
https://github.com/creid31/hellocucumber
1. Project setup
2. Define tests
3. Implement logic
4. Try writing logic first and tests last
5. Fix it!

Note: We will do a high-level overview of implementing TDD/BDD going through each branch and what was changed on them. Steps above correlate to their branches on the repo. Step 5 branch will be pushed at the end of the conference. After explaining step 4, create a PR to fix step 4 branch. See issue on repo for details. First person to submit a solution wins the lunch! Resources: https://docs.cucumber.io/guides/10-minute-tutorial/ and 

---

## Things that TDD is NOT!
- End all be all of all problems
- A hard fast rule that EVERYONE should follow

---

## Things that BDD is NOT!
- A means for unit testing or code coverage
- An opportunity for product owners to write tests
- End all be all fo all problems

Note: They should be able to read them and understand them but I am NOT a fan of having to stick to the phrasing given to me by someone else. Sometimes their phrasing does not fit or flow with the way we have to implement steps.

---

## Final Opinion
TDD and BDD ARE:
 - tools that can be leveraged to hone a better mindset for all possibilities of code
 - opportunities of good practice for wrapping your head around what is being asked of the feature
 - compliments to all types of testing including UI based
 
 At least give it a try!
 
---
# Thanks!
@cecili_reid