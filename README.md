# studyCompose

JetPack Compose는 native ui를 빌드하기 위한 android 최신 도구입니다.

UI개발을 간소화하고 가속화합니다.

적은 수의 코드, 강력한 도구 및 직관적인 Kotlin api를 사용합니다.

# Compose

Android를 위한 선언형 UI도구 키드이며, FrontEnd View를 명령형으로 변형하지 않고 렌더링할 수 있게하는 선언형 API를 제공하여 앱 UI를 더 쉽게 작성하고 유지관리를 할 수 있도록 지원합니다.

### 선언형 프로그래밍 패러다임

지금 사용하는 android 뷰 계층 구조는 트리로 표시할수 있습니다.

사용자 상호작용 등의 이유로 인해 앱의 상태가 변경되면, 현제 데이터를 표시하기 위해 UI 계층 구조를 업데이트해야 합니다.

일반적인 방법은 findViewById()와 같은 함수를 통해 트리를 탐색하고, view의 메서드를 통해 노트를 변경하는 것입니다.

다만, 뷰를 수동으로 조작하면 오류가 발생할 가능성이 커지며, 여러위치에서 렌더링 한다면 데이터를 표시하는 뷰중 하나를 업데이트하는 것을 잊기 쉽습니다.

또한, 충돌할 경우 잘못된 상태를 야기하기도 쉽습니다.

```kotlin
@Composable
fun Greeting(name: String){
	Text("Hello $name")
}
```

- @Composable
	- 이 함수가 데이터를 UI로 변환하기 위한 함수라는 것을 컴파일러에게 알려주는 역할

- Text()
	- 실제로 텍스트 UI요소를 생성하는 역할

### 선언형 패러다임 전환

선언형 접근 방식에서 위젯은 스테이트리스 형태이며 setter 또는 getter 함수를 노출하지 않습니다.

위젯은 객체로 노출되지않으며 동일한 구성 가능한 함수를 다른 인수로 호출하여 UI를 업데이트 합니다.

MVVM과 같은 아키텍처 패턴에 쉽게 적용가능합니다.

# 참고

[android developer](https://developer.android.com/jetpack/compose/mental-model?hl=ko)