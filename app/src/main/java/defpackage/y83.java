package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y83 {
    public final List<d93> a;
    public final zp1 b;
    public int c;

    public y83() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    public y83(List<d93> list, zp1 zp1Var) {
        this.a = list;
        this.b = zp1Var;
        MotionEvent motionEvent = zp1Var != null ? zp1Var.b.b : null;
        int i = 0;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = zp1Var != null ? zp1Var.b.b : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = zp1Var != null ? zp1Var.b.b : null;
        int i2 = 3;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i = 1;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            } else {
                i = 3;
            }
            i2 = i;
        } else {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                d93 d93Var = list.get(i3);
                if (Cz.g(d93Var)) {
                    i2 = 2;
                    break;
                }
                if (!d93Var.g && d93Var.d) {
                    i2 = 1;
                    break;
                }
            }
        }
        this.c = i2;
    }
}
