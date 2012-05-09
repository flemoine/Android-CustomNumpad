Android-CustomNumpad
====================

Custom Numpad based on Android KeyboardView

This is a simple application which helps people create their own Keyboard. My necessity is to create a Numpad, so this with be a launchpad for that. 

Please change heights and widths in keyboard.xml to change the dimensions and keys.

Change the heights and widths layout/main.xml to change the dimension of the entire keyboard size.

The keyboard view dispatches events to the activity.

In order to reuse this keyboard, make sure the keyboard custom view instance(object),make sure you call the setActionListenerActivity function with the activity to which you want to dispatch the event.

	CustomNumpadView cnv = (CustomNumpadView) findViewById(R.id.numpadView);
	cnv.setActionListenerActivity(this);

If this function is not set it will throw an error. I've purposely not handled exception handling so that you call the function.
