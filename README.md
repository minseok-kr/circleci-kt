# circle-kt
Simple Kotlin example with Unit Test, CircleCi for Continuous Integration .



#### Usage

* CircleCI
* Kotlin
* jUnit



#### TIL

1. CircleCI는 `./circleci/config.yml` 의 설정을 따라 간다.

2. 임의의 커맨드를 작성할 수 있다.

   ```
   steps:
   	# Case 1.
   	- run: gradle test
   	
   	# Case 2.
   	- run: 
   		name: Run Unit Tests
   		command: gradle test
   ```



3. CircleCI는 테스트 진행시 상세한 테스트 결과를 알려주진 않는다. 다음과 같은 설정으로 추가해주어야 웹 대시보드에서 볼 수 있다.

   ```
   # ...
   - run #...
   - store_test_results:
                   path: build/test-results
   ```



4. 다른 환경에서 `gradle` 커맨드가 실행되지 않을 때에는 `gradle/wrapper` 디렉토리에`gradle wrapper` 실행파일이 존재하진 않은지 확인해보자. 없다면 다음 커맨드로 실행파일을 생성한다.

   ```
   gradle wrap
   ```



#### References

https://circleci.com/docs/2.0/configuration-reference/#store_test_results
