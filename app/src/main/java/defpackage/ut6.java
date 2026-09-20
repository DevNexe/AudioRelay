package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgod;
import com.google.android.gms.internal.ads.zzgop;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgpc;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.android.gms.internal.ads.zzgrx;
import com.google.android.gms.internal.ads.zzgry;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ut6 {
    public static final /* synthetic */ int c = 0;
    public final yu6 a;
    public boolean b;

    static {
        new ut6(0);
    }

    public ut6() {
        this.a = new yu6(16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void b(zzgod zzgodVar, Object obj) {
        boolean z;
        zzgodVar.zzb();
        Charset charset = zzgox.a;
        obj.getClass();
        zzgrx zzgrxVar = zzgrx.zza;
        zzgry zzgryVar = zzgry.zza;
        switch (r0.zza()) {
            case zza:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zzb:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zzc:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zzd:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zze:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zzf:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zzg:
                if ((obj instanceof zzgnf) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zzh:
                if ((obj instanceof Integer) || (obj instanceof zzgop)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            case zzi:
                if ((obj instanceof zzgpx) || (obj instanceof zzgpc)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgodVar.zza()), zzgodVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void a(zzgod zzgodVar, Object obj) {
        if (!zzgodVar.zzc()) {
            b(zzgodVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b(zzgodVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        boolean z = obj instanceof zzgpc;
        this.a.put(zzgodVar, obj);
    }

    public final Object clone() {
        yu6 yu6Var;
        ut6 ut6Var = new ut6();
        int i = 0;
        while (true) {
            yu6Var = this.a;
            if (i >= yu6Var.x.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) yu6Var.x.get(i);
            ut6Var.a((zzgod) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : yu6Var.y.isEmpty() ? fp1.A : yu6Var.y.entrySet()) {
            ut6Var.a((zzgod) entry2.getKey(), entry2.getValue());
        }
        return ut6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ut6) {
            return this.a.equals(((ut6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ut6(int i) {
        yu6 yu6Var = new yu6(0);
        this.a = yu6Var;
        if (!this.b) {
            yu6Var.a();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        yu6Var.a();
        this.b = true;
    }
}
