const version = '0.0.1';

void main(List<String> arguments) {
  if (arguments.isEmpty){
    print('Hello world!');
  } else if (arguments.first == 'version'){
    print('Dart CLI version $version');
  }
  
}
