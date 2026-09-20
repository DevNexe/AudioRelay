package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
public final class Qj extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public wo A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ jo<Object> D;
    public final /* synthetic */ OVbg<Object, Object> E;
    public final /* synthetic */ is4<Ah<Object>> F;
    public final /* synthetic */ is4<j81<Object, sd5>> G;

    @if0(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {377}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ Object B;
        public final /* synthetic */ OVbg<Object, Object> C;
        public final /* synthetic */ is4<Ah<Object>> D;
        public final /* synthetic */ is4<j81<Object, sd5>> E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Object obj, OVbg<Object, Object> oVbg, is4<? extends Ah<Object>> is4Var, is4<? extends j81<Object, sd5>> is4Var2, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = obj;
            this.C = oVbg;
            this.D = is4Var;
            this.E = is4Var2;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, this.D, this.E, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            OVbg<Object, Object> oVbg = this.C;
            if (i == 0) {
                C0239D.H(obj);
                if (!ur1.a(this.B, oVbg.e.getValue())) {
                    OVbg<Object, Object> oVbg2 = this.C;
                    Object obj2 = this.B;
                    hr4<Float> hr4Var = WDjj.a;
                    Ah<Object> value = this.D.getValue();
                    this.A = 1;
                    if (OVbg.c(oVbg2, obj2, value, null, this, 12) == va0Var) {
                        return va0Var;
                    }
                }
                return sd5.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
            hr4<Float> hr4Var2 = WDjj.a;
            j81<Object, sd5> value2 = this.E.getValue();
            if (value2 != null) {
                value2.invoke(oVbg.d());
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
    public Qj(jo<Object> joVar, OVbg<Object, Object> oVbg, is4<? extends Ah<Object>> is4Var, is4<? extends j81<Object, sd5>> is4Var2, z80<? super Qj> z80Var) {
        super(2, z80Var);
        this.D = joVar;
        this.E = oVbg;
        this.F = is4Var;
        this.G = is4Var2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        Qj qj = new Qj(this.D, this.E, this.F, this.G, z80Var);
        qj.C = obj;
        return qj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003b -> B:13:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r14) {
        /*
            r13 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r13.B
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            wo r1 = r13.A
            java.lang.Object r3 = r13.C
            ua0 r3 = (defpackage.ua0) r3
            defpackage.C0239D.H(r14)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r13
            goto L41
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            defpackage.C0239D.H(r14)
            java.lang.Object r14 = r13.C
            ua0 r14 = (defpackage.ua0) r14
            jo<java.lang.Object> r1 = r13.D
            wo r1 = r1.iterator()
            r3 = r14
            r14 = r13
        L2e:
            r14.C = r3
            r14.A = r1
            r14.B = r2
            java.lang.Object r4 = r1.a(r14)
            if (r4 != r0) goto L3b
            return r0
        L3b:
            r12 = r0
            r0 = r14
            r14 = r4
            r4 = r3
            r3 = r1
            r1 = r12
        L41:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L74
            java.lang.Object r14 = r3.next()
            jo<java.lang.Object> r5 = r0.D
            java.lang.Object r5 = r5.r()
            java.lang.Object r5 = defpackage.ap.b(r5)
            if (r5 != 0) goto L5b
            r7 = r14
            goto L5c
        L5b:
            r7 = r5
        L5c:
            Qj$QnHx r14 = new Qj$QnHx
            OVbg<java.lang.Object, java.lang.Object> r8 = r0.E
            is4<Ah<java.lang.Object>> r9 = r0.F
            is4<j81<java.lang.Object, sd5>> r10 = r0.G
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r5 = 3
            r6 = 0
            r7 = 0
            defpackage.fp1.k0(r4, r7, r6, r14, r5)
            r14 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2e
        L74:
            sd5 r14 = defpackage.sd5.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Qj.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((Qj) a(ua0Var, z80Var)).i(sd5.a);
    }
}
