package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p05 {
    public static final QnHx a = new QnHx(null);

    @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {244}, m = "awaitFirstDownOnPass")
    public static final class CQf extends b90 {
        public z83 A;
        public boolean B;
        public /* synthetic */ Object C;
        public int D;
        public a5 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return p05.b(null, null, false, this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {206}, m = "invokeSuspend")
    public static final class F1 extends px4 implements x81<l93, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ od3 C;
        public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> D;
        public final /* synthetic */ j81<kt2, sd5> E;

        @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {208}, m = "invokeSuspend")
        public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public /* synthetic */ Object B;
            public final /* synthetic */ od3 C;
            public final /* synthetic */ l93 D;
            public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> E;
            public final /* synthetic */ j81<kt2, sd5> F;

            /* JADX INFO: renamed from: p05$F1$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {210, 216}, m = "invokeSuspend")
            public static final class C0179QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
                public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> A;
                public final /* synthetic */ ua0 B;
                public final /* synthetic */ od3 C;
                public final /* synthetic */ j81<kt2, sd5> D;
                public int y;
                public /* synthetic */ Object z;

                /* JADX INFO: renamed from: p05$F1$QnHx$QnHx$QnHx, reason: collision with other inner class name */
                @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", l = {213}, m = "invokeSuspend")
                public static final class C0180QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                    public int A;
                    public final /* synthetic */ y81<nd3, kt2, z80<? super sd5>, Object> B;
                    public final /* synthetic */ od3 C;
                    public final /* synthetic */ d93 D;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0180QnHx(y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, od3 od3Var, d93 d93Var, z80<? super C0180QnHx> z80Var) {
                        super(2, z80Var);
                        this.B = y81Var;
                        this.C = od3Var;
                        this.D = d93Var;
                    }

                    @Override // defpackage.m8
                    public final z80<sd5> a(Object obj, z80<?> z80Var) {
                        return new C0180QnHx(this.B, this.C, this.D, z80Var);
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
                        return ((C0180QnHx) a(ua0Var, z80Var)).i(sd5.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0179QnHx(y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, ua0 ua0Var, od3 od3Var, j81<? super kt2, sd5> j81Var, z80<? super C0179QnHx> z80Var) {
                    super(2, z80Var);
                    this.A = y81Var;
                    this.B = ua0Var;
                    this.C = od3Var;
                    this.D = j81Var;
                }

                @Override // defpackage.m8
                public final z80<sd5> a(Object obj, z80<?> z80Var) {
                    C0179QnHx c0179QnHx = new C0179QnHx(this.A, this.B, this.C, this.D, z80Var);
                    c0179QnHx.z = obj;
                    return c0179QnHx;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x005e  */
                /* JADX WARN: Code duplicated, block: B:22:0x0066  */
                /* JADX WARN: Code duplicated, block: B:24:0x0074  */
                @Override // defpackage.m8
                public final Object i(Object obj) throws Throwable {
                    a5 a5Var;
                    d93 d93Var;
                    j81<kt2, sd5> j81Var;
                    va0 va0Var = va0.COROUTINE_SUSPENDED;
                    int i = this.y;
                    od3 od3Var = this.C;
                    if (i != 0) {
                        if (i == 1) {
                            a5Var = (a5) this.z;
                            C0239D.H(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C0239D.H(obj);
                        }
                        d93Var = (d93) obj;
                        if (d93Var == null) {
                            od3Var.y = true;
                            od3Var.z.a(null);
                        } else {
                            d93Var.a();
                            od3Var.x = true;
                            od3Var.z.a(null);
                            j81Var = this.D;
                            if (j81Var != null) {
                                j81Var.invoke(new kt2(d93Var.c));
                            }
                        }
                        return sd5.a;
                    }
                    C0239D.H(obj);
                    a5Var = (a5) this.z;
                    this.z = a5Var;
                    this.y = 1;
                    obj = p05.b(a5Var, z83.Main, true, this);
                    if (obj == va0Var) {
                        return va0Var;
                    }
                    d93 d93Var2 = (d93) obj;
                    d93Var2.a();
                    QnHx qnHx = p05.a;
                    y81<nd3, kt2, z80<? super sd5>, Object> y81Var = this.A;
                    if (y81Var != qnHx) {
                        fp1.k0(this.B, null, 0, new C0180QnHx(y81Var, od3Var, d93Var2, null), 3);
                    }
                    this.z = null;
                    this.y = 2;
                    obj = p05.e(a5Var, this);
                    if (obj == va0Var) {
                        return va0Var;
                    }
                    d93Var = (d93) obj;
                    if (d93Var == null) {
                        od3Var.y = true;
                        od3Var.z.a(null);
                    } else {
                        d93Var.a();
                        od3Var.x = true;
                        od3Var.z.a(null);
                        j81Var = this.D;
                        if (j81Var != null) {
                            j81Var.invoke(new kt2(d93Var.c));
                        }
                    }
                    return sd5.a;
                }

                @Override // defpackage.x81
                public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
                    return ((C0179QnHx) a(a5Var, z80Var)).i(sd5.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public QnHx(od3 od3Var, l93 l93Var, y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, j81<? super kt2, sd5> j81Var, z80<? super QnHx> z80Var) {
                super(2, z80Var);
                this.C = od3Var;
                this.D = l93Var;
                this.E = y81Var;
                this.F = j81Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                QnHx qnHx = new QnHx(this.C, this.D, this.E, this.F, z80Var);
                qnHx.B = obj;
                return qnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    ua0 ua0Var = (ua0) this.B;
                    od3 od3Var = this.C;
                    od3Var.z.c(null);
                    od3Var.x = false;
                    od3Var.y = false;
                    C0179QnHx c0179QnHx = new C0179QnHx(this.E, ua0Var, this.C, this.F, null);
                    this.A = 1;
                    if (this.D.i0(c0179QnHx, this) == va0Var) {
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
                return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(od3 od3Var, y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, j81<? super kt2, sd5> j81Var, z80<? super F1> z80Var) {
            super(2, z80Var);
            this.C = od3Var;
            this.D = y81Var;
            this.E = j81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            F1 f1 = new F1(this.C, this.D, this.E, z80Var);
            f1.B = obj;
            return f1;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                QnHx qnHx = new QnHx(this.C, (l93) this.B, this.D, this.E, null);
                this.A = 1;
                if (fp1.R(qnHx, this) == va0Var) {
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
            return ((F1) a(l93Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {262, 277}, m = "waitForUpOrCancellation")
    public static final class LPt8Fixed extends b90 {
        public /* synthetic */ Object A;
        public int B;
        public a5 z;

        public LPt8Fixed(z80<? super LPt8Fixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return p05.e(null, this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements y81<nd3, kt2, z80<? super sd5>, Object> {
        public QnHx(z80<? super QnHx> z80Var) {
            super(3, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(nd3 nd3Var, kt2 kt2Var, z80<? super sd5> z80Var) throws Throwable {
            long j = kt2Var.a;
            new QnHx(z80Var);
            sd5 sd5Var = sd5.a;
            C0239D.H(sd5Var);
            return sd5Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[LOOP:1: B:22:0x005e->B:26:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.a5 r8, defpackage.z80 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.r05
            if (r0 == 0) goto L13
            r0 = r9
            r05 r0 = (defpackage.r05) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            r05 r0 = new r05
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.A
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a5 r8 = r0.z
            defpackage.C0239D.H(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.C0239D.H(r9)
        L34:
            r0.z = r8
            r0.B = r3
            java.lang.Object r9 = defpackage.z4.a(r8, r0)
            if (r9 != r1) goto L3f
            goto L73
        L3f:
            y83 r9 = (defpackage.y83) r9
            java.util.List<d93> r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L49:
            if (r6 >= r4) goto L57
            java.lang.Object r7 = r2.get(r6)
            d93 r7 = (defpackage.d93) r7
            r7.a()
            int r6 = r6 + 1
            goto L49
        L57:
            java.util.List<d93> r9 = r9.a
            int r2 = r9.size()
            r4 = 0
        L5e:
            if (r4 >= r2) goto L6f
            java.lang.Object r6 = r9.get(r4)
            d93 r6 = (defpackage.d93) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L6c
            r5 = 1
            goto L6f
        L6c:
            int r4 = r4 + 1
            goto L5e
        L6f:
            if (r5 != 0) goto L34
            sd5 r1 = defpackage.sd5.a
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p05.a(a5, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d A[LOOP:0: B:19:0x0054->B:37:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.a5 r10, defpackage.z83 r11, boolean r12, defpackage.z80<? super defpackage.d93> r13) {
        /*
            boolean r0 = r13 instanceof p05.CQf
            if (r0 == 0) goto L13
            r0 = r13
            p05$CQf r0 = (p05.CQf) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            p05$CQf r0 = new p05$CQf
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.C
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r10 = r0.B
            z83 r11 = r0.A
            a5 r12 = r0.z
            defpackage.C0239D.H(r13)
            r9 = r12
            r12 = r10
            r10 = r9
            goto L4a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.C0239D.H(r13)
        L3b:
            r0.z = r10
            r0.A = r11
            r0.B = r12
            r0.D = r3
            java.lang.Object r13 = r10.n0(r11, r0)
            if (r13 != r1) goto L4a
            return r1
        L4a:
            y83 r13 = (defpackage.y83) r13
            java.util.List<d93> r2 = r13.a
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L54:
            if (r6 >= r4) goto L80
            java.lang.Object r7 = r2.get(r6)
            d93 r7 = (defpackage.d93) r7
            if (r12 == 0) goto L70
            boolean r8 = r7.b()
            if (r8 != 0) goto L6e
            boolean r8 = r7.g
            if (r8 != 0) goto L6e
            boolean r7 = r7.d
            if (r7 == 0) goto L6e
        L6c:
            r7 = 1
            goto L79
        L6e:
            r7 = 0
            goto L79
        L70:
            boolean r8 = r7.g
            if (r8 != 0) goto L6e
            boolean r7 = r7.d
            if (r7 == 0) goto L6e
            goto L6c
        L79:
            if (r7 != 0) goto L7d
            r2 = 0
            goto L81
        L7d:
            int r6 = r6 + 1
            goto L54
        L80:
            r2 = 1
        L81:
            if (r2 == 0) goto L3b
            java.util.List<d93> r10 = r13.a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p05.b(a5, z83, boolean, z80):java.lang.Object");
    }

    public static final Object c(l93 l93Var, y81<? super nd3, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, j81<? super kt2, sd5> j81Var, z80<? super sd5> z80Var) throws Throwable {
        Object objB = b51.b(l93Var, new F1(new od3(l93Var), y81Var, j81Var, null), z80Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }

    public static Object d(l93 l93Var, hn4.QnHx qnHx, j81 j81Var, z80 z80Var, int i) {
        y81 y81Var = qnHx;
        if ((i & 4) != 0) {
            y81Var = a;
        }
        y81 y81Var2 = y81Var;
        if ((i & 8) != 0) {
            j81Var = null;
        }
        Object objR = fp1.R(new s05(l93Var, null, null, null, j81Var, y81Var2), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[LOOP:1: B:21:0x0056->B:32:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00ba -> B:56:0x00bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.a5 r13, defpackage.z80<? super defpackage.d93> r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p05.e(a5, z80):java.lang.Object");
    }
}
