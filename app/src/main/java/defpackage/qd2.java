package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.network.messages.MessageReceiverSessionTask$readMessages$1", f = "MessageReceiverSessionTask.kt", l = {74}, m = "invokeSuspend")
public final class qd2 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ c54 B;
    public final /* synthetic */ s50 C;
    public final /* synthetic */ md2 D;

    @if0(c = "com.azefsw.audioconnect.player.network.messages.MessageReceiverSessionTask$readMessages$1$1", f = "MessageReceiverSessionTask.kt", l = {77}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public m15 A;
        public int B;
        public final /* synthetic */ s50 C;
        public final /* synthetic */ md2 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(s50 s50Var, md2 md2Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = s50Var;
            this.D = md2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.C, this.D, z80Var);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0038  */
        /* JADX WARN: Code duplicated, block: B:18:0x0046  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:15:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r7) {
            /*
                r6 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r6.B
                r2 = 1
                if (r1 == 0) goto L1a
                if (r1 != r2) goto L12
                m15 r1 = r6.A
                defpackage.C0239D.H(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L3d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                defpackage.C0239D.H(r7)
                s50 r7 = r6.C
                m15 r7 = r7.b
                r1 = r7
                r7 = r6
            L23:
                s50 r3 = r7.C
                boolean r3 = r3.d
                if (r3 == 0) goto L4a
                md2 r3 = r7.D
                s50 r4 = r7.C
                r7.A = r1
                r7.B = r2
                java.lang.Object r3 = defpackage.md2.a(r3, r1, r4, r7)
                if (r3 != r0) goto L38
                return r0
            L38:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L3d:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L46
                goto L4a
            L46:
                r7 = r0
                r0 = r1
                r1 = r3
                goto L23
            L4a:
                sd5 r7 = defpackage.sd5.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qd2.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd2(c54 c54Var, s50 s50Var, md2 md2Var, z80<? super qd2> z80Var) {
        super(2, z80Var);
        this.B = c54Var;
        this.C = s50Var;
        this.D = md2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new qd2(this.B, this.C, this.D, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            c54 c54Var = this.B;
            oa0 h54Var = c54Var instanceof ol0 ? ((ol0) c54Var).b : new h54(c54Var);
            QnHx qnHx = new QnHx(this.C, this.D, null);
            this.A = 1;
            if (fp1.D0(h54Var, qnHx, this) == va0Var) {
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
        return ((qd2) a(ua0Var, z80Var)).i(sd5.a);
    }
}
