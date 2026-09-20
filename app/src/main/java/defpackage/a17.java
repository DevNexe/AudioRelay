package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a17 {
    public static final /* synthetic */ int c = 0;
    public final a47 a;
    public boolean b;

    static {
        new a17(0);
    }

    public a17() {
        this.a = new a47(16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    public static final void b(z07 z07Var, Object obj) {
        boolean z;
        z07Var.zzb();
        Charset charset = f27.a;
        obj.getClass();
        t57[] t57VarArr = t57.x;
        u57 u57Var = u57.x;
        switch (r0.w) {
            case x:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case y:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case z:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case A:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case B:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case C:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case D:
                if ((obj instanceof a07) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case E:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            case F:
                if (obj instanceof q37) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z07Var.zza()), z07Var.zzb().w, obj.getClass().getName()));
        }
    }

    public final void a(z07 z07Var, Object obj) {
        if (!z07Var.zzc()) {
            b(z07Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b(z07Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(z07Var, obj);
    }

    public final Object clone() {
        a47 a47Var;
        a17 a17Var = new a17();
        int i = 0;
        while (true) {
            a47Var = this.a;
            if (i >= a47Var.x.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) a47Var.x.get(i);
            a17Var.a((z07) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : a47Var.y.isEmpty() ? g7.L : a47Var.y.entrySet()) {
            a17Var.a((z07) entry2.getKey(), entry2.getValue());
        }
        return a17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a17) {
            return this.a.equals(((a17) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public a17(int i) {
        a47 a47Var = new a47(0);
        this.a = a47Var;
        if (!this.b) {
            a47Var.a();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        a47Var.a();
        this.b = true;
    }
}
