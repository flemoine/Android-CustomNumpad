package akash.app.customnumpad;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class CustomNumpadView extends KeyboardView {

    static CustomOnKeyboardActionListener keyListener;
    
    public CustomNumpadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        keyListener = new CustomOnKeyboardActionListener();
    }
    
    private class CustomOnKeyboardActionListener implements OnKeyboardActionListener {
        Activity owner;
        
        @Override
        public void onKey(int primaryCode, int[] keyCodes) {
            long eventTime = System.currentTimeMillis();
            KeyEvent event = new KeyEvent(eventTime, eventTime,
                    KeyEvent.ACTION_DOWN, primaryCode, 0, 0, 0, 0,
                    KeyEvent.FLAG_SOFT_KEYBOARD | KeyEvent.FLAG_KEEP_TOUCH_MODE);
            owner.dispatchKeyEvent(event);
        }

        @Override
        public void onPress(int primaryCode) {
        }

        @Override
        public void onRelease(int primaryCode) {
        }

        @Override
        public void onText(CharSequence text) {
        }

        @Override
        public void swipeDown() {
        }

        @Override
        public void swipeLeft() {
        }

        @Override
        public void swipeRight() {
        }

        @Override
        public void swipeUp() {
        }
        
    }

}
