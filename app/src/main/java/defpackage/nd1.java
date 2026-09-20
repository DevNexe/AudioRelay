package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
public final class nd1 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ua0 C;
    public final /* synthetic */ ci2 D;
    public final /* synthetic */ ri2<hd1> E;

    @if0(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
    public static final class QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
        public final /* synthetic */ la0 A;
        public final /* synthetic */ ua0 B;
        public final /* synthetic */ ci2 C;
        public final /* synthetic */ ri2<hd1> D;
        public int y;
        public /* synthetic */ Object z;

        @if0(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
        public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ ri2<hd1> B;
            public final /* synthetic */ ci2 C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CQf(ci2 ci2Var, ri2 ri2Var, z80 z80Var) {
                super(2, z80Var);
                this.B = ri2Var;
                this.C = ci2Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new CQf(this.C, this.B, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    this.A = 1;
                    if (qd1.b(this.C, this.B, this) == va0Var) {
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
                return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX INFO: renamed from: nd1$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
        public static final class C0173QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ ci2 B;
            public final /* synthetic */ ri2<hd1> C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0173QnHx(ci2 ci2Var, ri2<hd1> ri2Var, z80<? super C0173QnHx> z80Var) {
                super(2, z80Var);
                this.B = ci2Var;
                this.C = ri2Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new C0173QnHx(this.B, this.C, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    this.A = 1;
                    if (qd1.a(this.B, this.C, this) == va0Var) {
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
                return ((C0173QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(la0 la0Var, ua0 ua0Var, ci2 ci2Var, ri2<hd1> ri2Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.A = la0Var;
            this.B = ua0Var;
            this.C = ci2Var;
            this.D = ri2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.A, this.B, this.C, this.D, z80Var);
            qnHx.z = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d  */
        /* JADX WARN: Code duplicated, block: B:13:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0038  */
        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Code duplicated, block: B:21:0x0052  */
        /* JADX WARN: Code duplicated, block: B:22:0x005b  */
        /* JADX WARN: Code duplicated, block: B:24:0x005e  */
        /* JADX WARN: Code duplicated, block: B:25:0x0060  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:15:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r13) {
            /*
                r12 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r12.y
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r12.z
                a5 r1 = (defpackage.a5) r1
                defpackage.C0239D.H(r13)
                r3 = r1
                r1 = r0
                r0 = r12
                goto L3d
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1c:
                defpackage.C0239D.H(r13)
                java.lang.Object r13 = r12.z
                a5 r13 = (defpackage.a5) r13
                r1 = r13
                r13 = r12
            L25:
                la0 r3 = r13.A
                boolean r3 = defpackage.AY.F(r3)
                if (r3 == 0) goto L6f
                r13.z = r1
                r13.y = r2
                java.lang.Object r3 = defpackage.z4.a(r1, r13)
                if (r3 != r0) goto L38
                return r0
            L38:
                r11 = r0
                r0 = r13
                r13 = r3
                r3 = r1
                r1 = r11
            L3d:
                y83 r13 = (defpackage.y83) r13
                int r13 = r13.c
                r4 = 4
                r5 = 0
                if (r13 != r4) goto L47
                r4 = 1
                goto L48
            L47:
                r4 = 0
            L48:
                r6 = 3
                r7 = 0
                ua0 r8 = r0.B
                ri2<hd1> r9 = r0.D
                ci2 r10 = r0.C
                if (r4 == 0) goto L5b
                nd1$QnHx$QnHx r13 = new nd1$QnHx$QnHx
                r13.<init>(r10, r9, r7)
                defpackage.fp1.k0(r8, r7, r5, r13, r6)
                goto L6b
            L5b:
                r4 = 5
                if (r13 != r4) goto L60
                r13 = 1
                goto L61
            L60:
                r13 = 0
            L61:
                if (r13 == 0) goto L6b
                nd1$QnHx$CQf r13 = new nd1$QnHx$CQf
                r13.<init>(r10, r9, r7)
                defpackage.fp1.k0(r8, r7, r5, r13, r6)
            L6b:
                r13 = r0
                r0 = r1
                r1 = r3
                goto L25
            L6f:
                sd5 r13 = defpackage.sd5.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: nd1.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(a5Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd1(ci2 ci2Var, ri2 ri2Var, z80 z80Var, ua0 ua0Var) {
        super(2, z80Var);
        this.C = ua0Var;
        this.D = ci2Var;
        this.E = ri2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        nd1 nd1Var = new nd1(this.D, this.E, z80Var, this.C);
        nd1Var.B = obj;
        return nd1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.x, this.C, this.D, this.E, null);
            this.A = 1;
            if (l93Var.i0(qnHx, this) == va0Var) {
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
        return ((nd1) a(l93Var, z80Var)).i(sd5.a);
    }
}
