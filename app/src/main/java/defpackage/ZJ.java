package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: ZJ€, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class ZJ {
    public final Object a;

    /* JADX INFO: renamed from: ZJ€$CQf */
    public static class CQf extends QnHx {
        public CQf(ZJ zj) {
            super(zj);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            UT utB = this.a.b(i);
            if (utB == null) {
                return null;
            }
            return utB.a;
        }
    }

    /* JADX INFO: renamed from: ZJ€$F1 */
    public static class F1 extends CQf {
        public F1(ZJ zj) {
            super(zj);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.getClass();
        }
    }

    /* JADX INFO: renamed from: ZJ€$QnHx */
    public static class QnHx extends AccessibilityNodeProvider {
        public final ZJ a;

        public QnHx(ZJ zj) {
            this.a = zj;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            UT utA = this.a.a(i);
            if (utA == null) {
                return null;
            }
            return utA.a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.c(i, i2, bundle);
        }
    }

    public ZJ() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new F1(this);
        } else {
            this.a = new CQf(this);
        }
    }

    public UT a(int i) {
        return null;
    }

    public UT b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }

    public ZJ(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.a = accessibilityNodeProvider;
    }
}
