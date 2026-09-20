package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class sv0 extends d_OZ {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final QnHx o = new QnHx();
    public static final CQf p = new CQf();
    public final AccessibilityManager h;
    public final View i;
    public F1 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public class CQf {
    }

    public class F1 extends ZJ {
        public F1() {
        }

        @Override // defpackage.ZJ
        public final UT a(int i) {
            return new UT(AccessibilityNodeInfo.obtain(sv0.this.n(i).a));
        }

        @Override // defpackage.ZJ
        public final UT b(int i) {
            sv0 sv0Var = sv0.this;
            int i2 = i == 2 ? sv0Var.k : sv0Var.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002c  */
        @Override // defpackage.ZJ
        public final boolean c(int i, int i2, Bundle bundle) {
            int i3;
            sv0 sv0Var = sv0.this;
            View view = sv0Var.i;
            if (i == -1) {
                Field field = bi5.a;
                return bi5.LPt8Fixed.j(view, i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return sv0Var.s(i);
            }
            if (i2 == 2) {
                return sv0Var.j(i);
            }
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = sv0Var.h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = sv0Var.k) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        sv0Var.k = Integer.MIN_VALUE;
                        sv0Var.i.invalidate();
                        sv0Var.t(i3, 65536);
                    }
                    sv0Var.k = i;
                    view.invalidate();
                    sv0Var.t(i, 32768);
                } else {
                    z = false;
                }
            } else {
                if (i2 != 128) {
                    return sv0Var.o(i, i2);
                }
                if (sv0Var.k == i) {
                    sv0Var.k = Integer.MIN_VALUE;
                    view.invalidate();
                    sv0Var.t(i, 65536);
                } else {
                    z = false;
                }
            }
            return z;
        }
    }

    public class QnHx implements h31.QnHx<UT> {
    }

    public sv0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        Field field = bi5.a;
        if (bi5.LPt8Fixed.c(view) == 0) {
            bi5.LPt8Fixed.s(view, 1);
        }
    }

    @Override // defpackage.d_OZ
    public final ZJ b(View view) {
        if (this.j == null) {
            this.j = new F1();
        }
        return this.j;
    }

    @Override // defpackage.d_OZ
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // defpackage.d_OZ
    public final void d(View view, UT ut) {
        this.a.onInitializeAccessibilityNodeInfo(view, ut.a);
        p(ut);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        r(i, false);
        t(i, 8);
        return true;
    }

    public final UT k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        UT ut = new UT(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        ut.i("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        ut.b = -1;
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        q(i, ut);
        if (ut.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        ut.d(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        ut.c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        boolean z = false;
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            ut.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            ut.a(64);
        }
        boolean z2 = this.l == i;
        if (z2) {
            ut.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            ut.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            ut.d(rect3);
            if (ut.b != -1) {
                UT ut2 = new UT(AccessibilityNodeInfo.obtain());
                int i2 = ut.b;
                while (true) {
                    accessibilityNodeInfo = ut2.a;
                    if (i2 == -1) {
                        break;
                    }
                    ut2.b = -1;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    q(i2, ut2);
                    ut2.d(rect2);
                    rect3.offset(rect2.left, rect2.top);
                    i2 = ut2.b;
                }
                accessibilityNodeInfo.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = ut.a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            if (parent == null) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        View view2 = (View) parent;
                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                            break;
                        }
                        parent = view2.getParent();
                    }
                }
                if (z) {
                    accessibilityNodeInfo2.setVisibleToUser(true);
                }
            }
        }
        return ut;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:125:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    public final boolean m(int i, Rect rect) {
        Object obj;
        UT ut;
        int i2;
        int i3;
        Rect rect2;
        int iK;
        Rect rect3;
        int i4;
        UT ut2;
        UT ut3;
        boolean z;
        int i5;
        int iD;
        int iE;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        wq4 wq4Var = new wq4();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            wq4Var.j(((Integer) arrayList.get(i6)).intValue(), k(((Integer) arrayList.get(i6)).intValue()));
        }
        int i7 = this.l;
        int i8 = Integer.MIN_VALUE;
        UT ut4 = i7 == Integer.MIN_VALUE ? null : (UT) wq4Var.i(i7, null);
        QnHx qnHx = o;
        CQf cQf = p;
        View view = this.i;
        if (i == 1 || i == 2) {
            Field field = bi5.a;
            boolean z2 = bi5.NUlFixed.d(view) == 1;
            cQf.getClass();
            int iK2 = wq4Var.k();
            ArrayList arrayList2 = new ArrayList(iK2);
            for (int i9 = 0; i9 < iK2; i9++) {
                arrayList2.add((UT) wq4Var.l(i9));
            }
            Collections.sort(arrayList2, new h31.CQf(z2, qnHx));
            if (i == 1) {
                int size = arrayList2.size();
                if (ut4 != null) {
                    size = arrayList2.indexOf(ut4);
                }
                int i10 = size - 1;
                if (i10 >= 0) {
                    obj = arrayList2.get(i10);
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (ut4 == null ? -1 : arrayList2.lastIndexOf(ut4)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
            }
            ut = (UT) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i11 = this.l;
            if (i11 != Integer.MIN_VALUE) {
                n(i11).d(rect4);
            } else if (rect != null) {
                rect4.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    i3 = 0;
                    rect4.set(width, 0, width, height);
                } else if (i == 33) {
                    i3 = 0;
                    rect4.set(0, height, width, height);
                } else if (i == 66) {
                    rect4.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect4.set(0, -1, width, -1);
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    rect2.offset(rect4.width() + 1, i3);
                } else if (i != 33) {
                    rect2.offset(i3, rect4.height() + 1);
                } else if (i != 66) {
                    rect2.offset(-(rect4.width() + 1), i3);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.offset(i3, -(rect4.height() + 1));
                }
                cQf.getClass();
                iK = wq4Var.k();
                rect3 = new Rect();
                ut2 = null;
                for (i4 = 0; i4 < iK; i4++) {
                    ut3 = (UT) wq4Var.l(i4);
                    if (ut3 == ut4) {
                        qnHx.getClass();
                        ut3.d(rect3);
                        if (h31.c(i, rect4, rect3)) {
                            if (h31.c(i, rect4, rect2) && !h31.a(i, rect4, rect3, rect2)) {
                                if (!h31.a(i, rect4, rect2, rect3)) {
                                    int iD2 = h31.d(i, rect4, rect3);
                                    int iE2 = h31.e(i, rect4, rect3);
                                    i5 = (iE2 * iE2) + (iD2 * 13 * iD2);
                                    iD = h31.d(i, rect4, rect2);
                                    iE = h31.e(i, rect4, rect2);
                                    if (i5 < (iE * iE) + (iD * 13 * iD)) {
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            rect2.set(rect3);
                            ut2 = ut3;
                        }
                    }
                }
                ut = ut2;
            }
            i3 = 0;
            rect2 = new Rect(rect4);
            if (i != 17) {
                rect2.offset(rect4.width() + 1, i3);
            } else if (i != 33) {
                rect2.offset(i3, rect4.height() + 1);
            } else if (i != 66) {
                rect2.offset(-(rect4.width() + 1), i3);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect2.offset(i3, -(rect4.height() + 1));
            }
            cQf.getClass();
            iK = wq4Var.k();
            rect3 = new Rect();
            ut2 = null;
            while (i4 < iK) {
                ut3 = (UT) wq4Var.l(i4);
                if (ut3 == ut4) {
                    qnHx.getClass();
                    ut3.d(rect3);
                    if (h31.c(i, rect4, rect3)) {
                        if (h31.c(i, rect4, rect2)) {
                            if (!h31.a(i, rect4, rect2, rect3)) {
                                int iD3 = h31.d(i, rect4, rect3);
                                int iE3 = h31.e(i, rect4, rect3);
                                i5 = (iE3 * iE3) + (iD3 * 13 * iD3);
                                iD = h31.d(i, rect4, rect2);
                                iE = h31.e(i, rect4, rect2);
                                if (i5 < (iE * iE) + (iD * 13 * iD)) {
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        rect2.set(rect3);
                        ut2 = ut3;
                    }
                }
            }
            ut = ut2;
        }
        if (ut != null) {
            if (wq4Var.w) {
                wq4Var.h();
            }
            int i12 = 0;
            while (true) {
                if (i12 >= wq4Var.z) {
                    i2 = -1;
                    break;
                }
                if (wq4Var.y[i12] == ut) {
                    i2 = i12;
                    break;
                }
                i12++;
            }
            if (wq4Var.w) {
                wq4Var.h();
            }
            i8 = wq4Var.x[i2];
        }
        return s(i8);
    }

    public final UT n(int i) {
        if (i != -1) {
            return k(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        UT ut = new UT(accessibilityNodeInfoObtain);
        Field field = bi5.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ut.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return ut;
    }

    public abstract boolean o(int i, int i2);

    public void p(UT ut) {
    }

    public abstract void q(int i, UT ut);

    public void r(int i, boolean z) {
    }

    public final boolean s(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        r(i, true);
        t(i, 8);
        return true;
    }

    public final void t(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            UT utN = n(i);
            accessibilityEventObtain.getText().add(utN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = utN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            t84.a(accessibilityEventObtain, view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    public final void u(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        t(i, 128);
        t(i2, 256);
    }
}
