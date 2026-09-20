package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class o73 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = i;
            this.y = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            int i2 = this.y;
            o73.a(this.w, g30Var, i, i2);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ j81<f73, sd5> w;
        public final /* synthetic */ g73 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(j81<? super f73, sd5> j81Var, int i, g73 g73Var) {
            super(3);
            this.w = j81Var;
            this.x = g73Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                float f = 16;
                wo1.QnHx qnHx = wo1.a;
                zx2 zx2Var = new zx2(f, f, f, f);
                qu4.QnHx qnHx2 = qu4.a;
                Context context = kd.w;
                if (context == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                u15.a(iZUl.b(qu4.QnHx.b, context, R.string.player_settings_title), 0, zx2Var, g30Var2, 432, 0);
                String strX = hH.x(R.string.pref_audio_quality_preference_title, g30Var2);
                String strX2 = hH.x(R.string.pref_audio_quality_preference_summary, g30Var2);
                sz szVar = i10.a;
                g30Var2.e(1157296644);
                j81<f73, sd5> j81Var = this.w;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new p73(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                q55.b(null, strX, strX2, szVar, null, (h81) objF, g30Var2, 3072, 17);
                String strX3 = hH.x(R.string.pref_audio_output_preference_title, g30Var2);
                String strX4 = hH.x(R.string.pref_audio_output_preference_summary, g30Var2);
                sz szVar2 = i10.b;
                g30Var2.e(1157296644);
                boolean zI2 = g30Var2.I(j81Var);
                Object objF2 = g30Var2.f();
                if (zI2 || objF2 == c0132QnHx) {
                    objF2 = new q73(j81Var);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                q55.b(null, strX3, strX4, szVar2, null, (h81) objF2, g30Var2, 3072, 17);
                String strX5 = hH.x(R.string.pref_player_buffer_size_title, g30Var2);
                String strX6 = hH.x(R.string.pref_player_buffer_size_summary, g30Var2);
                sz szVar3 = i10.c;
                g30Var2.e(1157296644);
                boolean zI3 = g30Var2.I(j81Var);
                Object objF3 = g30Var2.f();
                if (zI3 || objF3 == c0132QnHx) {
                    objF3 = new r73(j81Var);
                    g30Var2.B(objF3);
                }
                g30Var2.G();
                q55.b(null, strX5, strX6, szVar3, null, (h81) objF3, g30Var2, 3072, 17);
                String strX7 = hH.x(R.string.pref_player_respect_audio_focus_title, g30Var2);
                String strX8 = hH.x(R.string.pref_player_respect_audio_focus_summary, g30Var2);
                sz szVar4 = i10.d;
                g30Var2.e(1157296644);
                boolean zI4 = g30Var2.I(j81Var);
                Object objF4 = g30Var2.f();
                if (zI4 || objF4 == c0132QnHx) {
                    objF4 = new s73(j81Var);
                    g30Var2.B(objF4);
                }
                g30Var2.G();
                q55.b(null, strX7, strX8, szVar4, null, (h81) objF4, g30Var2, 3072, 17);
                String strX9 = hH.x(R.string.pref_player_handle_noisy_events_title, g30Var2);
                String strX10 = hH.x(R.string.pref_player_handle_noisy_events_summary, g30Var2);
                g73 g73Var = this.x;
                Boolean bool = g73Var.c;
                sz szVar5 = i10.e;
                g30Var2.e(1157296644);
                boolean zI5 = g30Var2.I(j81Var);
                Object objF5 = g30Var2.f();
                if (zI5 || objF5 == c0132QnHx) {
                    objF5 = new t73(j81Var);
                    g30Var2.B(objF5);
                }
                g30Var2.G();
                oy4.a(strX9, null, szVar5, bool, strX10, null, false, false, null, (j81) objF5, g30Var2, 384, 482);
                if (g73Var.a) {
                    String strX11 = hH.x(R.string.pref_player_media_style_notification_title, g30Var2);
                    String strX12 = hH.x(R.string.pref_player_media_style_notification_summary, g30Var2);
                    Boolean bool2 = g73Var.b;
                    sz szVar6 = i10.f;
                    g30Var2.e(1157296644);
                    boolean zI6 = g30Var2.I(j81Var);
                    Object objF6 = g30Var2.f();
                    if (zI6 || objF6 == c0132QnHx) {
                        objF6 = new u73(j81Var);
                        g30Var2.B(objF6);
                    }
                    g30Var2.G();
                    oy4.a(strX11, null, szVar6, bool2, strX12, null, false, false, null, (j81) objF6, g30Var2, 384, 482);
                }
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ g73 w;
        public final /* synthetic */ j81<f73, sd5> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(g73 g73Var, j81<? super f73, sd5> j81Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = g73Var;
            this.x = j81Var;
            this.y = pg2Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            o73.b(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<f73, sd5> {
        public final /* synthetic */ x73 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(x73 x73Var) {
            super(1);
            this.w = x73Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(f73 f73Var) {
            this.w.g(f73Var);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        Object obj;
        j30 j30VarQ = g30Var.q(-197545382);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            j30VarQ.e(-789651797);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            v73 v73Var = v73.w;
            w73 w73Var = new w73(bm2Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(v73Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(w73Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(x73.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            x73 x73Var = (x73) ((ZUx) obj);
            j30VarQ.R(false);
            g73 g73Var = (g73) ps0.t(x73Var.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(x73Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new QnHx(x73Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            b(g73Var, (j81) objB1, pg2Var, j30VarQ, (i3 << 6) & 896, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void b(g73 g73Var, j81<? super f73, sd5> j81Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        pg2 pg2Var3;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1781905591);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(g73Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 896) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !j30VarQ.t()) {
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf = e40.a;
                a_.b(pg2Var3, 0L, 0, null, 0.0f, X.m(j30VarQ, 1445053944, new F1(j81Var, i3, g73Var)), j30VarQ, ((i3 >> 6) & 14) | 196992, 26);
                pg2Var4 = pg2Var3;
            } else {
                j30VarQ.x();
                pg2Var4 = pg2Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(g73Var, j81Var, pg2Var4, i, i2);
        }
        i3 |= 384;
        pg2Var2 = pg2Var;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf2 = e40.a;
            a_.b(pg2Var3, 0L, 0, null, 0.0f, X.m(j30VarQ, 1445053944, new F1(j81Var, i3, g73Var)), j30VarQ, ((i3 >> 6) & 14) | 196992, 26);
            pg2Var4 = pg2Var3;
        } else {
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf3 = e40.a;
            a_.b(pg2Var3, 0L, 0, null, 0.0f, X.m(j30VarQ, 1445053944, new F1(j81Var, i3, g73Var)), j30VarQ, ((i3 >> 6) & 14) | 196992, 26);
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(g73Var, j81Var, pg2Var4, i, i2);
    }
}
