package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m93 implements k93 {
    public j81<? super MotionEvent, Boolean> w;
    public fp3 x;
    public boolean y;
    public final QnHx z = new QnHx();

    public static final class QnHx extends j93 {
        public int y = 1;

        public static final class CQf extends cx1 implements j81<MotionEvent, sd5> {
            public final /* synthetic */ m93 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CQf(m93 m93Var) {
                super(1);
                this.x = m93Var;
            }

            @Override // defpackage.j81
            public final sd5 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int actionMasked = motionEvent2.getActionMasked();
                m93 m93Var = this.x;
                if (actionMasked == 0) {
                    j81<? super MotionEvent, Boolean> j81Var = m93Var.w;
                    if (j81Var == null) {
                        ur1.e("onTouchEvent");
                        throw null;
                    }
                    QnHx.this.y = j81Var.invoke(motionEvent2).booleanValue() ? 2 : 3;
                } else {
                    j81<? super MotionEvent, Boolean> j81Var2 = m93Var.w;
                    if (j81Var2 == null) {
                        ur1.e("onTouchEvent");
                        throw null;
                    }
                    j81Var2.invoke(motionEvent2);
                }
                return sd5.a;
            }
        }

        public static final class F1 extends cx1 implements j81<MotionEvent, sd5> {
            public final /* synthetic */ m93 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public F1(m93 m93Var) {
                super(1);
                this.w = m93Var;
            }

            @Override // defpackage.j81
            public final sd5 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                j81<? super MotionEvent, Boolean> j81Var = this.w.w;
                if (j81Var != null) {
                    j81Var.invoke(motionEvent2);
                    return sd5.a;
                }
                ur1.e("onTouchEvent");
                throw null;
            }
        }

        /* JADX INFO: renamed from: m93$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0167QnHx extends cx1 implements j81<MotionEvent, sd5> {
            public final /* synthetic */ m93 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0167QnHx(m93 m93Var) {
                super(1);
                this.w = m93Var;
            }

            @Override // defpackage.j81
            public final sd5 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                j81<? super MotionEvent, Boolean> j81Var = this.w.w;
                if (j81Var != null) {
                    j81Var.invoke(motionEvent2);
                    return sd5.a;
                }
                ur1.e("onTouchEvent");
                throw null;
            }
        }

        public QnHx() {
        }

        @Override // defpackage.j93
        public final void A() {
            if (this.y == 2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                m93 m93Var = m93.this;
                F1 f1 = new F1(m93Var);
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                motionEventObtain.setSource(0);
                f1.invoke(motionEventObtain);
                motionEventObtain.recycle();
                this.y = 1;
                m93Var.y = false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:25:0x003b  */
        @Override // defpackage.j93
        public final void I(y83 y83Var, z83 z83Var, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            m93 m93Var = m93.this;
            boolean z4 = m93Var.y;
            List<d93> list = y83Var.a;
            if (z4) {
                z = true;
            } else {
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z3 = false;
                        break;
                    }
                    d93 d93Var = list.get(i);
                    if ((!d93Var.g && d93Var.d) || Cz.g(d93Var)) {
                        z3 = true;
                        break;
                    }
                    i++;
                }
                if (z3) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int i2 = this.y;
            z83 z83Var2 = z83.Final;
            if (i2 != 3) {
                if (z83Var == z83.Initial && z) {
                    Z(y83Var);
                }
                if (z83Var == z83Var2 && !z) {
                    Z(y83Var);
                }
            }
            if (z83Var == z83Var2) {
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        z2 = true;
                        break;
                    } else {
                        if (!Cz.g(list.get(i3))) {
                            z2 = false;
                            break;
                        }
                        i3++;
                    }
                }
                if (z2) {
                    this.y = 1;
                    m93Var.y = false;
                }
            }
        }

        public final void Z(y83 y83Var) {
            boolean z;
            List<d93> list = y83Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                } else {
                    if (list.get(i).b()) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            m93 m93Var = m93.this;
            if (z) {
                if (this.y == 2) {
                    iy1 iy1Var = this.w;
                    if (iy1Var == null) {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                    hH.C(y83Var, iy1Var.O(kt2.b), new C0167QnHx(m93Var), true);
                }
                this.y = 3;
                return;
            }
            iy1 iy1Var2 = this.w;
            if (iy1Var2 == null) {
                throw new IllegalStateException("layoutCoordinates not set".toString());
            }
            hH.C(y83Var, iy1Var2.O(kt2.b), new CQf(m93Var), false);
            if (this.y == 2) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    list.get(i2).a();
                }
                zp1 zp1Var = y83Var.b;
                if (zp1Var == null) {
                    return;
                }
                zp1Var.c = !m93Var.y;
            }
        }
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.k93
    public final j93 N() {
        return this.z;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
