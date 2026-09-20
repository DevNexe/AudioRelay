package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$flatMapLatest$2", f = "RunningAndroidServerInputHandler.kt", l = {216}, m = "invokeSuspend")
public final class vv3 extends px4 implements y81<nz0<? super List<? extends le2>>, List<? extends me2>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ gx3 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv3(gx3 gx3Var, z80 z80Var) {
        super(3, z80Var);
        this.D = gx3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            List list = (List) this.C;
            this.D.getClass();
            List<me2> list2 = list;
            ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
            for (me2 me2Var : list2) {
                arrayList.add(new lv3(iE.b(me2Var.d.a(null)), me2Var));
            }
            Object[] array = wu.e1(arrayList).toArray(new mz0[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            mz0[] mz0VarArr = (mz0[]) array;
            this.A = 1;
            if (nz0Var instanceof o75) {
                throw ((o75) nz0Var).w;
            }
            Object objE = qLd.e(this, new mv3(mz0VarArr), new nv3(null), nz0Var, mz0VarArr);
            if (objE != obj2) {
                objE = sd5.a;
            }
            if (objE != obj2) {
                objE = sd5.a;
            }
            if (objE == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(nz0<? super List<? extends le2>> nz0Var, List<? extends me2> list, z80<? super sd5> z80Var) {
        vv3 vv3Var = new vv3(this.D, z80Var);
        vv3Var.B = nz0Var;
        vv3Var.C = list;
        return vv3Var.i(sd5.a);
    }
}
