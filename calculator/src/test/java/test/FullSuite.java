package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.operations.*;

@RunWith(Suite.class)
@SuiteClasses({
	TestAddition.class,
	TestMultiplication.class,
	TestOperation.class,
	TestSubtraction.class,
	TestDivision.class
})

public class FullSuite {}
