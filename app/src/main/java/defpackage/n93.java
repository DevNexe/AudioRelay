package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class n93 extends cx1 implements j81<MotionEvent, Boolean> {
    public final /* synthetic */ X05 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n93(zi5 zi5Var) {
        super(1);
        this.w = zi5Var;
    }

    @Override // defpackage.j81
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        X05 x05 = this.w;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = x05.dispatchTouchEvent(motionEvent2);
                break;
            default:
                zDispatchTouchEvent = x05.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
