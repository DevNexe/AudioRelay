package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d55 implements r53 {
    public final View a;
    public final jo1 b;
    public boolean c;
    public j81<? super List<? extends qq0>, sd5> d;
    public j81<? super hj1, sd5> e;
    public x45 f;
    public ij1 g;
    public cl3 h;
    public final oz1 i;
    public final NUlFixed j;

    public static final class CQf extends cx1 implements j81<List<? extends qq0>, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(List<? extends qq0> list) {
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<hj1, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* synthetic */ sd5 invoke(hj1 hj1Var) {
            int i = hj1Var.a;
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {189}, m = "textInputCommandEventLoop")
    public static final class LPt8Fixed extends b90 {
        public wo A;
        public /* synthetic */ Object B;
        public int D;
        public d55 z;

        public LPt8Fixed(z80<? super LPt8Fixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return d55.this.f(this);
        }
    }

    public enum QnHx {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    public d55(View view) {
        ko1 ko1Var = new ko1(view.getContext());
        this.a = view;
        this.b = ko1Var;
        this.d = g55.w;
        this.e = h55.w;
        this.f = new x45("", s55.b, 4);
        this.g = ij1.f;
        this.i = qLd.h(3, new e55(this));
        this.j = AY.a(Integer.MAX_VALUE, null, 6);
    }

    @Override // defpackage.r53
    public final void a() {
        this.j.H(QnHx.ShowKeyboard);
    }

    @Override // defpackage.r53
    public final void b() {
        this.c = false;
        this.d = CQf.w;
        this.e = F1.w;
        this.j.H(QnHx.StopInput);
    }

    @Override // defpackage.r53
    public final void c(x45 x45Var, x45 x45Var2) {
        long j = this.f.b;
        long j2 = x45Var2.b;
        boolean zA = s55.a(j, j2);
        boolean z = true;
        boolean z2 = false;
        s55 s55Var = x45Var2.c;
        boolean z3 = (zA && ur1.a(this.f.c, s55Var)) ? false : true;
        this.f = x45Var2;
        cl3 cl3Var = this.h;
        if (cl3Var != null) {
            cl3Var.d = x45Var2;
        }
        if (ur1.a(x45Var, x45Var2)) {
            if (z3) {
                jo1 jo1Var = this.b;
                View view = this.a;
                int iE = s55.e(j2);
                int iD = s55.d(j2);
                s55 s55Var2 = this.f.c;
                int iE2 = s55Var2 != null ? s55.e(s55Var2.a) : -1;
                s55 s55Var3 = this.f.c;
                jo1Var.c(view, iE, iD, iE2, s55Var3 != null ? s55.d(s55Var3.a) : -1);
                return;
            }
            return;
        }
        if (x45Var != null) {
            if (ur1.a(x45Var.a.w, x45Var2.a.w) && (!s55.a(x45Var.b, j2) || ur1.a(x45Var.c, s55Var))) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            this.b.e(this.a);
            return;
        }
        cl3 cl3Var2 = this.h;
        if (cl3Var2 != null) {
            x45 x45Var3 = this.f;
            jo1 jo1Var2 = this.b;
            View view2 = this.a;
            if (cl3Var2.h) {
                cl3Var2.d = x45Var3;
                if (cl3Var2.f) {
                    jo1Var2.d(view2, cl3Var2.e, hH.B(x45Var3));
                }
                s55 s55Var4 = x45Var3.c;
                int iE3 = s55Var4 != null ? s55.e(s55Var4.a) : -1;
                int iD2 = s55Var4 != null ? s55.d(s55Var4.a) : -1;
                long j3 = x45Var3.b;
                jo1Var2.c(view2, s55.e(j3), s55.d(j3), iE3, iD2);
            }
        }
    }

    @Override // defpackage.r53
    public final void d(x45 x45Var, ij1 ij1Var, t25 t25Var, u45.QnHx qnHx) {
        this.c = true;
        this.f = x45Var;
        this.g = ij1Var;
        this.d = t25Var;
        this.e = qnHx;
        this.j.H(QnHx.StartInput);
    }

    @Override // defpackage.r53
    public final void e() {
        this.j.H(QnHx.HideKeyboard);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[LOOP:0: B:22:0x0066->B:60:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:22:0x0066->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v23, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v26, types: [T, java.lang.Boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:39:0x0099
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(defpackage.z80<? super defpackage.sd5> r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d55.f(z80):java.lang.Object");
    }
}
