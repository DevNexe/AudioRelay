package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gu0 extends oa0 {
    public static final /* synthetic */ int B = 0;
    public u0<kl0<?>> A;
    public long y;
    public boolean z;

    public final void I(boolean z) {
        long j = this.y - (z ? 4294967296L : 1L);
        this.y = j;
        if (j <= 0 && this.z) {
            shutdown();
        }
    }

    public final void T(kl0<?> kl0Var) {
        u0<kl0<?>> u0Var = this.A;
        if (u0Var == null) {
            u0Var = new u0<>();
            this.A = u0Var;
        }
        Object[] objArr = u0Var.a;
        int i = u0Var.c;
        objArr[i] = kl0Var;
        int length = (objArr.length - 1) & (i + 1);
        u0Var.c = length;
        int i2 = u0Var.b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            NPO.a0(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = u0Var.a;
            int length3 = objArr3.length;
            int i3 = u0Var.b;
            NPO.a0(objArr3, objArr2, length3 - i3, 0, i3, 4);
            u0Var.a = objArr2;
            u0Var.b = 0;
            u0Var.c = length2;
        }
    }

    public final void Z(boolean z) {
        this.y = (z ? 4294967296L : 1L) + this.y;
        if (z) {
            return;
        }
        this.z = true;
    }

    public final boolean h0() {
        return this.y >= 4294967296L;
    }

    public long i0() {
        return !l0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean l0() {
        u0<kl0<?>> u0Var = this.A;
        if (u0Var == null) {
            return false;
        }
        int i = u0Var.b;
        Object obj = null;
        if (i != u0Var.c) {
            Object[] objArr = u0Var.a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            u0Var.b = (i + 1) & (objArr.length - 1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            obj = obj2;
        }
        kl0 kl0Var = (kl0) obj;
        if (kl0Var == null) {
            return false;
        }
        kl0Var.run();
        return true;
    }

    public void shutdown() {
    }
}
