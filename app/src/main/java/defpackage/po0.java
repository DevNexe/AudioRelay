package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class po0 implements dw1 {
    public final j81 a;

    public /* synthetic */ po0() {
        this.a = ew1.QnHx.D;
    }

    @Override // defpackage.dw1
    public int a(KeyEvent keyEvent) {
        xv1 xv1Var = new xv1(keyEvent);
        j81 j81Var = this.a;
        if (!((Boolean) j81Var.invoke(xv1Var)).booleanValue() || !keyEvent.isShiftPressed()) {
            if (((Boolean) j81Var.invoke(new xv1(keyEvent))).booleanValue()) {
                long jB = zv1.b(keyEvent);
                if (wv1.a(jB, s92.b) ? true : wv1.a(jB, s92.p)) {
                    return 17;
                }
                if (!wv1.a(jB, s92.d)) {
                    if (!wv1.a(jB, s92.e)) {
                        if (wv1.a(jB, s92.a)) {
                            return 26;
                        }
                        if (wv1.a(jB, s92.f)) {
                            return 46;
                        }
                    }
                    return 19;
                }
                return 18;
            }
            if (!keyEvent.isCtrlPressed()) {
                if (!keyEvent.isShiftPressed()) {
                    long jB2 = zv1.b(keyEvent);
                    if (wv1.a(jB2, s92.h)) {
                        return 1;
                    }
                    if (wv1.a(jB2, s92.i)) {
                        return 2;
                    }
                    if (wv1.a(jB2, s92.j)) {
                        return 11;
                    }
                    if (wv1.a(jB2, s92.k)) {
                        return 12;
                    }
                    if (wv1.a(jB2, s92.l)) {
                        return 13;
                    }
                    if (wv1.a(jB2, s92.m)) {
                        return 14;
                    }
                    if (wv1.a(jB2, s92.n)) {
                        return 7;
                    }
                    if (wv1.a(jB2, s92.o)) {
                        return 8;
                    }
                    if (wv1.a(jB2, s92.q)) {
                        return 44;
                    }
                    if (wv1.a(jB2, s92.r)) {
                        return 20;
                    }
                    if (wv1.a(jB2, s92.s)) {
                        return 21;
                    }
                    if (!wv1.a(jB2, s92.t)) {
                        if (!wv1.a(jB2, s92.u)) {
                            if (wv1.a(jB2, s92.v)) {
                                return 45;
                            }
                        }
                        return 19;
                    }
                    return 18;
                }
                long jB3 = zv1.b(keyEvent);
                if (wv1.a(jB3, s92.h)) {
                    return 27;
                }
                if (wv1.a(jB3, s92.i)) {
                    return 28;
                }
                if (wv1.a(jB3, s92.j)) {
                    return 29;
                }
                if (wv1.a(jB3, s92.k)) {
                    return 30;
                }
                if (wv1.a(jB3, s92.l)) {
                    return 31;
                }
                if (wv1.a(jB3, s92.m)) {
                    return 32;
                }
                if (wv1.a(jB3, s92.n)) {
                    return 39;
                }
                if (wv1.a(jB3, s92.o)) {
                    return 40;
                }
                if (wv1.a(jB3, s92.p)) {
                    return 18;
                }
            }
        } else if (wv1.a(zv1.b(keyEvent), s92.f)) {
            return 47;
        }
        return 0;
    }
}
