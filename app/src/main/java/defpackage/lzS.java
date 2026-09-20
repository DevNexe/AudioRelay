package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class lzS implements x_$C {
    public final AccessibilityManager a;

    public lzS(Context context) {
        Object systemService = context.getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.a = (AccessibilityManager) systemService;
    }

    @Override // defpackage.x_$C
    public final long a(long j, boolean z) {
        if (j >= 2147483647L) {
            return j;
        }
        int i = z ? 7 : 3;
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.a;
        if (i2 >= 29) {
            int iA = WUcA.a.a(accessibilityManager, (int) j, i);
            if (iA != Integer.MAX_VALUE) {
                return iA;
            }
        } else if (!z || !accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
