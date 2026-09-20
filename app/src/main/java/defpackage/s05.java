package defpackage;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {92}, m = "invokeSuspend")
public final class s05 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ l93 C;
    public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> D;
    public final /* synthetic */ j81<kt2, sd5> E;
    public final /* synthetic */ j81<kt2, sd5> F;
    public final /* synthetic */ j81<kt2, sd5> G;

    @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {93}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<l93, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ od3 C;
        public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> D;
        public final /* synthetic */ ua0 E;
        public final /* synthetic */ j81<kt2, sd5> F;
        public final /* synthetic */ j81<kt2, sd5> G;
        public final /* synthetic */ j81<kt2, sd5> H;

        /* JADX INFO: renamed from: s05$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {94, 106, 117, 127, 140, 158}, m = "invokeSuspend")
        public static final class C0190QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
            public jl3 A;
            public long B;
            public int C;
            public /* synthetic */ Object D;
            public final /* synthetic */ od3 E;
            public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> F;
            public final /* synthetic */ ua0 G;
            public final /* synthetic */ j81<kt2, sd5> H;
            public final /* synthetic */ j81<kt2, sd5> I;
            public final /* synthetic */ j81<kt2, sd5> J;
            public Object y;
            public Object z;

            /* JADX INFO: renamed from: s05$QnHx$QnHx$CQf */
            @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", l = {107}, m = "invokeSuspend")
            public static final class CQf extends eq3 implements x81<a5, z80<? super d93>, Object> {
                public int y;
                public /* synthetic */ Object z;

                public CQf(z80<? super CQf> z80Var) {
                    super(2, z80Var);
                }

                @Override // defpackage.m8
                public final z80<sd5> a(Object obj, z80<?> z80Var) {
                    CQf cQf = new CQf(z80Var);
                    cQf.z = obj;
                    return cQf;
                }

                @Override // defpackage.m8
                public final Object i(Object obj) throws Throwable {
                    va0 va0Var = va0.COROUTINE_SUSPENDED;
                    int i = this.y;
                    if (i == 0) {
                        C0239D.H(obj);
                        a5 a5Var = (a5) this.z;
                        this.y = 1;
                        obj = p05.e(a5Var, this);
                        if (obj == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    return obj;
                }

                @Override // defpackage.x81
                public final Object invoke(a5 a5Var, z80<? super d93> z80Var) {
                    return ((CQf) a(a5Var, z80Var)).i(sd5.a);
                }
            }

            /* JADX INFO: renamed from: s05$QnHx$QnHx$F1 */
            @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", l = {135}, m = "invokeSuspend")
            public static final class F1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                public int A;
                public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> B;
                public final /* synthetic */ od3 C;
                public final /* synthetic */ d93 D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public F1(y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, od3 od3Var, d93 d93Var, z80<? super F1> z80Var) {
                    super(2, z80Var);
                    this.B = y81Var;
                    this.C = od3Var;
                    this.D = d93Var;
                }

                @Override // defpackage.m8
                public final z80<sd5> a(Object obj, z80<?> z80Var) {
                    return new F1(this.B, this.C, this.D, z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) throws Throwable {
                    va0 va0Var = va0.COROUTINE_SUSPENDED;
                    int i = this.A;
                    if (i == 0) {
                        C0239D.H(obj);
                        kt2 kt2Var = new kt2(this.D.c);
                        this.A = 1;
                        if (this.B.invoke(this.C, kt2Var, this) == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    return sd5.a;
                }

                @Override // defpackage.x81
                public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                    return ((F1) a(ua0Var, z80Var)).i(sd5.a);
                }
            }

            /* JADX INFO: renamed from: s05$QnHx$QnHx$LPt8 */
            @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", l = {141}, m = "invokeSuspend")
            public static final class LPt8Fixed extends eq3 implements x81<a5, z80<? super sd5>, Object> {
                public final /* synthetic */ od3 A;
                public final /* synthetic */ j81<kt2, sd5> B;
                public final /* synthetic */ j81<kt2, sd5> C;
                public final /* synthetic */ jl3<d93> D;
                public int y;
                public /* synthetic */ Object z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public LPt8Fixed(od3 od3Var, j81<? super kt2, sd5> j81Var, j81<? super kt2, sd5> j81Var2, jl3<d93> jl3Var, z80<? super LPt8Fixed> z80Var) {
                    super(2, z80Var);
                    this.A = od3Var;
                    this.B = j81Var;
                    this.C = j81Var2;
                    this.D = jl3Var;
                }

                @Override // defpackage.m8
                public final z80<sd5> a(Object obj, z80<?> z80Var) {
                    LPt8Fixed lPt8 = new LPt8Fixed(this.A, this.B, this.C, this.D, z80Var);
                    lPt8.z = obj;
                    return lPt8;
                }

                @Override // defpackage.m8
                public final Object i(Object obj) throws Throwable {
                    va0 va0Var = va0.COROUTINE_SUSPENDED;
                    int i = this.y;
                    if (i == 0) {
                        C0239D.H(obj);
                        a5 a5Var = (a5) this.z;
                        this.y = 1;
                        obj = p05.e(a5Var, this);
                        if (obj == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    d93 d93Var = (d93) obj;
                    od3 od3Var = this.A;
                    if (d93Var != null) {
                        d93Var.a();
                        od3Var.x = true;
                        od3Var.z.a(null);
                        this.B.invoke(new kt2(d93Var.c));
                        return sd5.a;
                    }
                    od3Var.y = true;
                    od3Var.z.a(null);
                    j81<kt2, sd5> j81Var = this.C;
                    if (j81Var == null) {
                        return null;
                    }
                    j81Var.invoke(new kt2(this.D.w.c));
                    return sd5.a;
                }

                @Override // defpackage.x81
                public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
                    return ((LPt8Fixed) a(a5Var, z80Var)).i(sd5.a);
                }
            }

            /* JADX INFO: renamed from: s05$QnHx$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", l = {98}, m = "invokeSuspend")
            public static final class C0191QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                public int A;
                public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> B;
                public final /* synthetic */ od3 C;
                public final /* synthetic */ d93 D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0191QnHx(y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, od3 od3Var, d93 d93Var, z80<? super C0191QnHx> z80Var) {
                    super(2, z80Var);
                    this.B = y81Var;
                    this.C = od3Var;
                    this.D = d93Var;
                }

                @Override // defpackage.m8
                public final z80<sd5> a(Object obj, z80<?> z80Var) {
                    return new C0191QnHx(this.B, this.C, this.D, z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) throws Throwable {
                    va0 va0Var = va0.COROUTINE_SUSPENDED;
                    int i = this.A;
                    if (i == 0) {
                        C0239D.H(obj);
                        kt2 kt2Var = new kt2(this.D.c);
                        this.A = 1;
                        if (this.B.invoke(this.C, kt2Var, this) == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    return sd5.a;
                }

                @Override // defpackage.x81
                public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                    return ((C0191QnHx) a(ua0Var, z80Var)).i(sd5.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0190QnHx(od3 od3Var, y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, ua0 ua0Var, j81<? super kt2, sd5> j81Var, j81<? super kt2, sd5> j81Var2, j81<? super kt2, sd5> j81Var3, z80<? super C0190QnHx> z80Var) {
                super(2, z80Var);
                this.E = od3Var;
                this.F = y81Var;
                this.G = ua0Var;
                this.H = j81Var;
                this.I = j81Var2;
                this.J = j81Var3;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                C0190QnHx c0190QnHx = new C0190QnHx(this.E, this.F, this.G, this.H, this.I, this.J, z80Var);
                c0190QnHx.D = obj;
                return c0190QnHx;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:30:0x00dc A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
            /* JADX WARN: Code duplicated, block: B:34:0x00e6 A[Catch: PointerEventTimeoutCancellationException -> 0x0072, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0072, blocks: (B:14:0x006b, B:32:0x00e0, B:34:0x00e6, B:35:0x00ee), top: B:79:0x006b }] */
            /* JADX WARN: Code duplicated, block: B:35:0x00ee A[Catch: PointerEventTimeoutCancellationException -> 0x0072, TRY_LEAVE, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0072, blocks: (B:14:0x006b, B:32:0x00e0, B:34:0x00e6, B:35:0x00ee), top: B:79:0x006b }] */
            /* JADX WARN: Code duplicated, block: B:40:0x0102  */
            /* JADX WARN: Code duplicated, block: B:43:0x011f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:47:0x012d  */
            /* JADX WARN: Code duplicated, block: B:49:0x0131 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:50:0x0133  */
            /* JADX WARN: Code duplicated, block: B:51:0x0141  */
            /* JADX WARN: Code duplicated, block: B:53:0x0167 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:56:0x016c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:57:0x016e  */
            /* JADX WARN: Code duplicated, block: B:58:0x017e  */
            /* JADX WARN: Code duplicated, block: B:60:0x018e  */
            /* JADX WARN: Code duplicated, block: B:63:0x01bd A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:66:0x01c2  */
            /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
            /* JADX WARN: Code duplicated, block: B:71:0x01eb A[RETURN] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                a5 a5Var;
                Object objB;
                d93 d93Var;
                long jC;
                jl3 jl3Var;
                jl3 jl3Var2;
                a5 a5Var2;
                Object objT;
                jl3 jl3Var3;
                jl3 jl3Var4;
                a5 a5Var3;
                T t;
                T t2;
                T t3;
                Object objX;
                d93 d93Var2;
                jl3 jl3Var5;
                LPt8Fixed lPt8;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.C;
                ua0 ua0Var = this.G;
                y81<nd3, kt2, z80<? super sd5>, Object> y81Var = this.F;
                j81<kt2, sd5> j81Var = this.J;
                j81<kt2, sd5> j81Var2 = this.H;
                od3 od3Var = this.E;
                switch (i) {
                    case 0:
                        C0239D.H(obj);
                        a5Var = (a5) this.D;
                        this.D = a5Var;
                        this.C = 1;
                        objB = p05.b(a5Var, z83.Main, true, this);
                        if (objB == va0Var) {
                            return va0Var;
                        }
                        d93Var = (d93) objB;
                        d93Var.a();
                        od3Var.z.c(null);
                        od3Var.x = false;
                        od3Var.y = false;
                        if (y81Var != p05.a) {
                            fp1.k0(ua0Var, null, 0, new C0191QnHx(y81Var, od3Var, d93Var, null), 3);
                        }
                        if (j81Var2 != null) {
                            jC = a5Var.getViewConfiguration().c();
                        } else {
                            jC = 4611686018427387903L;
                        }
                        jl3Var = new jl3();
                        try {
                            CQf cQf = new CQf(null);
                            this.D = a5Var;
                            this.y = d93Var;
                            this.z = jl3Var;
                            this.A = jl3Var;
                            this.B = jC;
                            this.C = 2;
                            objT = a5Var.t(jC, cQf, this);
                            if (objT == va0Var) {
                                return va0Var;
                            }
                            jl3Var2 = jl3Var;
                            a5Var2 = a5Var;
                            jl3Var3 = jl3Var2;
                            t = objT;
                            jl3Var3.w = t;
                            t2 = jl3Var2.w;
                            if (t2 == 0) {
                                od3Var.y = true;
                                od3Var.z.a(null);
                            } else {
                                ((d93) t2).a();
                                od3Var.x = true;
                                od3Var.z.a(null);
                            }
                            t3 = jl3Var2.w;
                            if (t3 != 0) {
                                if (this.I == null) {
                                    this.D = a5Var2;
                                    this.y = jl3Var2;
                                    this.z = null;
                                    this.A = null;
                                    this.B = jC;
                                    this.C = 4;
                                    p05.QnHx qnHx = p05.a;
                                    objX = a5Var2.X(a5Var2.getViewConfiguration().a(), new q05((d93) t3, null), this);
                                    if (objX == va0Var) {
                                        return va0Var;
                                    }
                                    d93Var2 = (d93) objX;
                                    if (d93Var2 != null) {
                                        od3Var.z.c(null);
                                        od3Var.x = false;
                                        od3Var.y = false;
                                        if (y81Var != p05.a) {
                                            fp1.k0(ua0Var, null, 0, new F1(y81Var, od3Var, d93Var2, null), 3);
                                        }
                                        try {
                                            lPt8 = new LPt8Fixed(this.E, this.I, this.J, jl3Var2, null);
                                            this.D = a5Var2;
                                            this.y = jl3Var2;
                                            this.z = d93Var2;
                                            this.C = 5;
                                            if (a5Var2.t(jC, lPt8, this) == va0Var) {
                                                return va0Var;
                                            }
                                        } catch (PointerEventTimeoutCancellationException unused) {
                                            jl3Var5 = jl3Var2;
                                            if (j81Var != null) {
                                                j81Var.invoke(new kt2(((d93) jl3Var5.w).c));
                                            }
                                            if (j81Var2 != null) {
                                                j81Var2.invoke(new kt2(d93Var2.c));
                                            }
                                            this.D = null;
                                            this.y = null;
                                            this.z = null;
                                            this.C = 6;
                                            if (p05.a(a5Var2, this) == va0Var) {
                                                return va0Var;
                                            }
                                            od3Var.x = true;
                                            od3Var.z.a(null);
                                        }
                                    } else if (j81Var != null) {
                                        j81Var.invoke(new kt2(((d93) jl3Var2.w).c));
                                    }
                                } else if (j81Var != null) {
                                    j81Var.invoke(new kt2(((d93) t3).c));
                                }
                            }
                            return sd5.a;
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            jl3Var2 = jl3Var;
                            a5Var2 = a5Var;
                            jl3Var4 = jl3Var2;
                            a5Var3 = a5Var2;
                            if (j81Var2 != null) {
                                j81Var2.invoke(new kt2(d93Var.c));
                            }
                            this.D = a5Var3;
                            this.y = jl3Var4;
                            this.z = null;
                            this.A = null;
                            this.B = jC;
                            this.C = 3;
                            if (p05.a(a5Var3, this) == va0Var) {
                                return va0Var;
                            }
                            od3Var.x = true;
                            od3Var.z.a(null);
                            a5Var2 = a5Var3;
                            jl3Var2 = jl3Var4;
                        }
                        break;
                    case 1:
                        a5Var = (a5) this.D;
                        C0239D.H(obj);
                        objB = obj;
                        d93Var = (d93) objB;
                        d93Var.a();
                        od3Var.z.c(null);
                        od3Var.x = false;
                        od3Var.y = false;
                        if (y81Var != p05.a) {
                            fp1.k0(ua0Var, null, 0, new C0191QnHx(y81Var, od3Var, d93Var, null), 3);
                        }
                        if (j81Var2 != null) {
                            jC = a5Var.getViewConfiguration().c();
                        } else {
                            jC = 4611686018427387903L;
                        }
                        jl3Var = new jl3();
                        CQf cQf2 = new CQf(null);
                        this.D = a5Var;
                        this.y = d93Var;
                        this.z = jl3Var;
                        this.A = jl3Var;
                        this.B = jC;
                        this.C = 2;
                        objT = a5Var.t(jC, cQf2, this);
                        if (objT == va0Var) {
                            return va0Var;
                        }
                        jl3Var2 = jl3Var;
                        a5Var2 = a5Var;
                        jl3Var3 = jl3Var2;
                        t = objT;
                        jl3Var3.w = t;
                        t2 = jl3Var2.w;
                        if (t2 == 0) {
                            od3Var.y = true;
                            od3Var.z.a(null);
                        } else {
                            ((d93) t2).a();
                            od3Var.x = true;
                            od3Var.z.a(null);
                        }
                        t3 = jl3Var2.w;
                        if (t3 != 0) {
                            if (this.I == null) {
                                this.D = a5Var2;
                                this.y = jl3Var2;
                                this.z = null;
                                this.A = null;
                                this.B = jC;
                                this.C = 4;
                                p05.QnHx qnHx2 = p05.a;
                                objX = a5Var2.X(a5Var2.getViewConfiguration().a(), new q05((d93) t3, null), this);
                                if (objX == va0Var) {
                                    return va0Var;
                                }
                                d93Var2 = (d93) objX;
                                if (d93Var2 != null) {
                                    od3Var.z.c(null);
                                    od3Var.x = false;
                                    od3Var.y = false;
                                    if (y81Var != p05.a) {
                                        fp1.k0(ua0Var, null, 0, new F1(y81Var, od3Var, d93Var2, null), 3);
                                    }
                                    lPt8 = new LPt8Fixed(this.E, this.I, this.J, jl3Var2, null);
                                    this.D = a5Var2;
                                    this.y = jl3Var2;
                                    this.z = d93Var2;
                                    this.C = 5;
                                    if (a5Var2.t(jC, lPt8, this) == va0Var) {
                                        return va0Var;
                                    }
                                } else if (j81Var != null) {
                                    j81Var.invoke(new kt2(((d93) jl3Var2.w).c));
                                }
                            } else if (j81Var != null) {
                                j81Var.invoke(new kt2(((d93) t3).c));
                            }
                        }
                        return sd5.a;
                    case 2:
                        jC = this.B;
                        jl3Var3 = this.A;
                        jl3Var2 = (jl3) this.z;
                        d93Var = (d93) this.y;
                        a5Var2 = (a5) this.D;
                        try {
                            C0239D.H(obj);
                            t = obj;
                            jl3Var3.w = t;
                            t2 = jl3Var2.w;
                            if (t2 == 0) {
                                od3Var.y = true;
                                od3Var.z.a(null);
                            } else {
                                ((d93) t2).a();
                                od3Var.x = true;
                                od3Var.z.a(null);
                            }
                        } catch (PointerEventTimeoutCancellationException unused3) {
                            jl3Var4 = jl3Var2;
                            a5Var3 = a5Var2;
                            if (j81Var2 != null) {
                                j81Var2.invoke(new kt2(d93Var.c));
                            }
                            this.D = a5Var3;
                            this.y = jl3Var4;
                            this.z = null;
                            this.A = null;
                            this.B = jC;
                            this.C = 3;
                            if (p05.a(a5Var3, this) == va0Var) {
                                return va0Var;
                            }
                            od3Var.x = true;
                            od3Var.z.a(null);
                            a5Var2 = a5Var3;
                            jl3Var2 = jl3Var4;
                        }
                        t3 = jl3Var2.w;
                        if (t3 != 0) {
                            if (this.I == null) {
                                this.D = a5Var2;
                                this.y = jl3Var2;
                                this.z = null;
                                this.A = null;
                                this.B = jC;
                                this.C = 4;
                                p05.QnHx qnHx3 = p05.a;
                                objX = a5Var2.X(a5Var2.getViewConfiguration().a(), new q05((d93) t3, null), this);
                                if (objX == va0Var) {
                                    return va0Var;
                                }
                                d93Var2 = (d93) objX;
                                if (d93Var2 != null) {
                                    od3Var.z.c(null);
                                    od3Var.x = false;
                                    od3Var.y = false;
                                    if (y81Var != p05.a) {
                                        fp1.k0(ua0Var, null, 0, new F1(y81Var, od3Var, d93Var2, null), 3);
                                    }
                                    lPt8 = new LPt8Fixed(this.E, this.I, this.J, jl3Var2, null);
                                    this.D = a5Var2;
                                    this.y = jl3Var2;
                                    this.z = d93Var2;
                                    this.C = 5;
                                    if (a5Var2.t(jC, lPt8, this) == va0Var) {
                                        return va0Var;
                                    }
                                } else if (j81Var != null) {
                                    j81Var.invoke(new kt2(((d93) jl3Var2.w).c));
                                }
                            } else if (j81Var != null) {
                                j81Var.invoke(new kt2(((d93) t3).c));
                            }
                        }
                        return sd5.a;
                    case 3:
                        jC = this.B;
                        jl3Var4 = (jl3) this.y;
                        a5Var3 = (a5) this.D;
                        C0239D.H(obj);
                        od3Var.x = true;
                        od3Var.z.a(null);
                        a5Var2 = a5Var3;
                        jl3Var2 = jl3Var4;
                        t3 = jl3Var2.w;
                        if (t3 != 0) {
                            if (this.I == null) {
                                this.D = a5Var2;
                                this.y = jl3Var2;
                                this.z = null;
                                this.A = null;
                                this.B = jC;
                                this.C = 4;
                                p05.QnHx qnHx4 = p05.a;
                                objX = a5Var2.X(a5Var2.getViewConfiguration().a(), new q05((d93) t3, null), this);
                                if (objX == va0Var) {
                                    return va0Var;
                                }
                                d93Var2 = (d93) objX;
                                if (d93Var2 != null) {
                                    od3Var.z.c(null);
                                    od3Var.x = false;
                                    od3Var.y = false;
                                    if (y81Var != p05.a) {
                                        fp1.k0(ua0Var, null, 0, new F1(y81Var, od3Var, d93Var2, null), 3);
                                    }
                                    lPt8 = new LPt8Fixed(this.E, this.I, this.J, jl3Var2, null);
                                    this.D = a5Var2;
                                    this.y = jl3Var2;
                                    this.z = d93Var2;
                                    this.C = 5;
                                    if (a5Var2.t(jC, lPt8, this) == va0Var) {
                                        return va0Var;
                                    }
                                } else if (j81Var != null) {
                                    j81Var.invoke(new kt2(((d93) jl3Var2.w).c));
                                }
                            } else if (j81Var != null) {
                                j81Var.invoke(new kt2(((d93) t3).c));
                            }
                        }
                        return sd5.a;
                    case 4:
                        jC = this.B;
                        jl3 jl3Var6 = (jl3) this.y;
                        a5 a5Var4 = (a5) this.D;
                        C0239D.H(obj);
                        a5Var2 = a5Var4;
                        jl3Var2 = jl3Var6;
                        objX = obj;
                        d93Var2 = (d93) objX;
                        if (d93Var2 != null) {
                            od3Var.z.c(null);
                            od3Var.x = false;
                            od3Var.y = false;
                            if (y81Var != p05.a) {
                                fp1.k0(ua0Var, null, 0, new F1(y81Var, od3Var, d93Var2, null), 3);
                            }
                            lPt8 = new LPt8Fixed(this.E, this.I, this.J, jl3Var2, null);
                            this.D = a5Var2;
                            this.y = jl3Var2;
                            this.z = d93Var2;
                            this.C = 5;
                            if (a5Var2.t(jC, lPt8, this) == va0Var) {
                                return va0Var;
                            }
                        } else if (j81Var != null) {
                            j81Var.invoke(new kt2(((d93) jl3Var2.w).c));
                        }
                        return sd5.a;
                    case 5:
                        d93Var2 = (d93) this.z;
                        jl3Var5 = (jl3) this.y;
                        a5Var2 = (a5) this.D;
                        try {
                            C0239D.H(obj);
                            break;
                        } catch (PointerEventTimeoutCancellationException unused4) {
                            if (j81Var != null) {
                                j81Var.invoke(new kt2(((d93) jl3Var5.w).c));
                            }
                            if (j81Var2 != null) {
                                j81Var2.invoke(new kt2(d93Var2.c));
                            }
                            this.D = null;
                            this.y = null;
                            this.z = null;
                            this.C = 6;
                            if (p05.a(a5Var2, this) == va0Var) {
                                return va0Var;
                            }
                            od3Var.x = true;
                            od3Var.z.a(null);
                        }
                        return sd5.a;
                    case 6:
                        C0239D.H(obj);
                        od3Var.x = true;
                        od3Var.z.a(null);
                        return sd5.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // defpackage.x81
            public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
                return ((C0190QnHx) a(a5Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(od3 od3Var, y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, ua0 ua0Var, j81<? super kt2, sd5> j81Var, j81<? super kt2, sd5> j81Var2, j81<? super kt2, sd5> j81Var3, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = od3Var;
            this.D = y81Var;
            this.E = ua0Var;
            this.F = j81Var;
            this.G = j81Var2;
            this.H = j81Var3;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, this.E, this.F, this.G, this.H, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                l93 l93Var = (l93) this.B;
                C0190QnHx c0190QnHx = new C0190QnHx(this.C, this.D, this.E, this.F, this.G, this.H, null);
                this.A = 1;
                if (l93Var.i0(c0190QnHx, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(l93Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s05(l93 l93Var, z80 z80Var, j81 j81Var, j81 j81Var2, j81 j81Var3, y81 y81Var) {
        super(2, z80Var);
        this.C = l93Var;
        this.D = y81Var;
        this.E = j81Var;
        this.F = j81Var2;
        this.G = j81Var3;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        s05 s05Var = new s05(this.C, z80Var, this.E, this.F, this.G, this.D);
        s05Var.B = obj;
        return s05Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.B;
            l93 l93Var = this.C;
            QnHx qnHx = new QnHx(new od3(l93Var), this.D, ua0Var, this.E, this.F, this.G, null);
            this.A = 1;
            if (b51.b(l93Var, qnHx, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((s05) a(ua0Var, z80Var)).i(sd5.a);
    }
}
