package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.running.RunningPlayerInputHandler$handleInput$$inlined$observeFlows$1", f = "RunningPlayerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class ez3 extends px4 implements x81<gk4<sy3, ry3, uy3>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ oz3 B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<sy3, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<sy3, ry3, uy3> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(gk4 gk4Var, z80 z80Var) {
            super(2, z80Var);
            this.C = gk4Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to ez3$QnHx for r3v1 'this'  z80
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r4) {
            /*
                r3 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r3.A
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.C0239D.H(r4)
                goto L25
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                defpackage.C0239D.H(r4)
                java.lang.Object r4 = r3.B
                r3.A = r2
                gk4<sy3, ry3, uy3> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ez3.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(sy3 sy3Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(sy3Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez3(oz3 oz3Var, z80 z80Var) {
        super(2, z80Var);
        this.B = oz3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ez3 ez3Var = new ez3(this.B, z80Var);
        ez3Var.A = obj;
        return ez3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        oz3 oz3Var = this.B;
        oz3Var.getClass();
        mz0[] mz0VarArr = new mz0[6];
        c54 c54Var = j54.b;
        ny1 ny1Var = oz3Var.a;
        int i = 16;
        mz0VarArr[0] = iE.b(new cs2(ny1Var.i(c54Var), new k71(i)));
        cq4 cq4Var = oz3Var.b;
        vq2 vq2VarK = vq2.k(((ot4) cq4Var.y).a(c54Var), ((ln2) cq4Var.x).c(c54Var), xnX3.z);
        int i2 = 12;
        NFo7 nFo7 = new NFo7(cq4Var, i2);
        vq2VarK.getClass();
        am amVarB = iE.b(new cs2(new cs2(vq2VarK, nFo7), new NFo7(oz3Var, i)));
        d7G d7g = oz3Var.c;
        ds2 ds2VarC = ((ln2) d7g.y).c(c54Var);
        cq4 cq4Var2 = (cq4) d7g.x;
        w01 w01Var = new w01(amVarB, iE.b(vq2.k(ds2VarC, iE.d(new zp(((by1) cq4Var2.y).a(), cq4Var2)), new qLd())), new dz3(null));
        gq0.QnHx qnHx = gq0.x;
        mz0VarArr[1] = new d24(new sa0(w01Var, ps0.o0(1, kq0.SECONDS), null));
        vq2<List<mp2>> vq2VarC = ((op2) oz3Var.e.x).c(c54Var);
        Acr acr = new Acr(i2);
        vq2VarC.getClass();
        mz0VarArr[2] = iE.b(new cs2(vq2VarC, acr));
        List listM = ps0.M(new fz4("AUDIO_TRACK_OUTPUT"), new fz4("OPEN_SL_OUTPUT"));
        uz4 uz4Var = oz3Var.g;
        uz4Var.getClass();
        List list = listM;
        ArrayList arrayList = new ArrayList(mu.w0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new gr2(new sz4(uz4Var, ((fz4) it.next()).a, c54Var)));
        }
        vq2 vq2VarP = new vr2(arrayList).p(m91.a, Integer.MAX_VALUE);
        k71 k71Var = new k71(17);
        vq2VarP.getClass();
        mz0VarArr[3] = new az3(new yy3(iE.b(new cs2(vq2VarP, k71Var))));
        C0w c0w = oz3Var.f;
        vk4<Boolean> vk4VarO = c0w.a.o();
        Ot0r ot0r = new Ot0r(c0w, i2);
        vk4VarO.getClass();
        mz0VarArr[4] = iE.b(new cs2(new hl4(vk4VarO, ot0r).A(j54.c), new KnU(i2)));
        mz0VarArr[5] = kd.G(new xy3(kd.i(new bz3(iE.b(ny1Var.i(j54.b))))), new zy3(null));
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(ps0.M(mz0VarArr))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<sy3, ry3, uy3> gk4Var, z80<? super sd5> z80Var) {
        return ((ez3) a(gk4Var, z80Var)).i(sd5.a);
    }
}
