package defpackage;

import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzg;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class tp1 {
    public int a;
    public Object b;

    public /* synthetic */ tp1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ tp1(int i, o36 o36Var) {
        this.a = i;
        this.b = o36Var;
    }

    public Object a() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.b;
        Object obj2 = ((Object[]) obj)[i2];
        ((Object[]) obj)[i2] = null;
        this.a = i - 1;
        return obj2;
    }

    public final synchronized void b() {
        this.a++;
    }

    public final synchronized void c() {
        int i = this.a - 1;
        this.a = i;
        if (i <= 0) {
            Object obj = this.b;
            if (((Runnable) obj) != null) {
                ((Runnable) obj).run();
            }
        }
    }

    public final int d() {
        int[] iArr = (int[]) this.b;
        int i = this.a - 1;
        this.a = i;
        return iArr[i];
    }

    public final void e(int i) {
        int i2 = this.a;
        Object obj = this.b;
        if (i2 >= ((int[]) obj).length) {
            this.b = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
        }
        int[] iArr = (int[]) this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr[i3] = i;
    }

    public boolean f(Object obj) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (((Object[]) this.b)[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object obj2 = this.b;
        if (i >= ((Object[]) obj2).length) {
            return false;
        }
        ((Object[]) obj2)[i] = obj;
        this.a = i + 1;
        return true;
    }

    public final float g(tp1 tp1Var) {
        int i = this.a;
        float fFloatValue = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            fFloatValue += ((Float[]) tp1Var.b)[i2].floatValue() * ((Float[]) this.b)[i2].floatValue();
        }
        return fFloatValue;
    }

    public final long h(zzzg zzzgVar) {
        zzyv zzyvVar = (zzyv) zzzgVar;
        int i = 0;
        zzyvVar.zzm(((zzed) this.b).zzH(), 0, 1, false);
        int i2 = ((zzed) this.b).zzH()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        zzyvVar.zzm(((zzed) this.b).zzH(), 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (((zzed) this.b).zzH()[i] & 255) + (i5 << 8);
        }
        this.a = i4 + 1 + this.a;
        return i5;
    }

    public tp1(int i) {
        if (i == 3) {
            this.b = new zzed(8);
        } else if (i != 6) {
            this.b = new int[10];
        } else {
            this.a = 0;
        }
    }

    public tp1(int i, int i2) {
        if (i2 == 2) {
            if (i > 0) {
                this.b = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = i;
        Float[] fArr = new Float[i];
        for (int i3 = 0; i3 < i; i3++) {
            fArr[i3] = Float.valueOf(0.0f);
        }
        this.b = fArr;
    }
}
