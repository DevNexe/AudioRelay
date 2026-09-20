package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class bAJ6 extends cx1 implements h81<sd5> {
    public final /* synthetic */ k64 w;
    public final /* synthetic */ Z5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bAJ6(Z5 z5, k64 k64Var) {
        super(0);
        this.w = k64Var;
        this.x = z5;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    @Override // defpackage.h81
    public final sd5 invoke() {
        AccessibilityEvent accessibilityEventL;
        k64 k64Var = this.w;
        w54 w54Var = k64Var.A;
        w54 w54Var2 = k64Var.B;
        Float f = k64Var.y;
        Float f2 = k64Var.z;
        float fFloatValue = (w54Var == null || f == null) ? 0.0f : w54Var.a.invoke().floatValue() - f.floatValue();
        float fFloatValue2 = (w54Var2 == null || f2 == null) ? 0.0f : w54Var2.a.invoke().floatValue() - f2.floatValue();
        if (fFloatValue == 0.0f) {
            if (!(fFloatValue2 == 0.0f)) {
                int i = k64Var.w;
                Z5 z5 = this.x;
                int iY = z5.y(i);
                Z5.B(z5, iY, 2048, 1, 8);
                accessibilityEventL = z5.l(iY, 4096);
                if (w54Var != null) {
                    accessibilityEventL.setScrollX((int) w54Var.a.invoke().floatValue());
                    accessibilityEventL.setMaxScrollX((int) w54Var.b.invoke().floatValue());
                }
                if (w54Var2 != null) {
                    accessibilityEventL.setScrollY((int) w54Var2.a.invoke().floatValue());
                    accessibilityEventL.setMaxScrollY((int) w54Var2.b.invoke().floatValue());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    Z5.F1.a(accessibilityEventL, (int) fFloatValue, (int) fFloatValue2);
                }
                z5.z(accessibilityEventL);
            }
        } else {
            int i2 = k64Var.w;
            Z5 z6 = this.x;
            int iY2 = z6.y(i2);
            Z5.B(z6, iY2, 2048, 1, 8);
            accessibilityEventL = z6.l(iY2, 4096);
            if (w54Var != null) {
                accessibilityEventL.setScrollX((int) w54Var.a.invoke().floatValue());
                accessibilityEventL.setMaxScrollX((int) w54Var.b.invoke().floatValue());
            }
            if (w54Var2 != null) {
                accessibilityEventL.setScrollY((int) w54Var2.a.invoke().floatValue());
                accessibilityEventL.setMaxScrollY((int) w54Var2.b.invoke().floatValue());
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Z5.F1.a(accessibilityEventL, (int) fFloatValue, (int) fFloatValue2);
            }
            z6.z(accessibilityEventL);
        }
        if (w54Var != null) {
            k64Var.y = w54Var.a.invoke();
        }
        if (w54Var2 != null) {
            k64Var.z = w54Var2.a.invoke();
        }
        return sd5.a;
    }
}
