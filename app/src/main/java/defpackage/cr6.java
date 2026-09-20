package defpackage;

import com.google.android.gms.internal.ads.zzgac;
import com.google.android.gms.internal.ads.zzgcy;
import com.google.android.gms.internal.ads.zzgem;
import com.google.android.gms.internal.ads.zzgeo;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class cr6 {
    public static final Logger b = Logger.getLogger(cr6.class.getName());
    public final ConcurrentHashMap a;

    public cr6() {
        this.a = new ConcurrentHashMap();
    }

    public final zzgac a(Class cls, String str) throws GeneralSecurityException {
        br6 br6VarD = d(str);
        if (br6VarD.zze().contains(cls)) {
            return br6VarD.a(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(br6VarD.zzc());
        Set<Class> setZze = br6VarD.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setZze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    public final synchronized void b(zzgeo zzgeoVar, zzgem zzgemVar) {
        Class clsZzd;
        int iZze = zzgemVar.zze();
        if (!zzgcy.zza(1)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgeoVar.getClass()) + " as it is not FIPS compatible.");
        }
        if (!zzgcy.zza(iZze)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgemVar.getClass()) + " as it is not FIPS compatible.");
        }
        String strZzc = zzgeoVar.zzc();
        String strZzc2 = zzgemVar.zzc();
        if (this.a.containsKey(strZzc) && ((br6) this.a.get(strZzc)).zzd() != null && (clsZzd = ((br6) this.a.get(strZzc)).zzd()) != null && !clsZzd.getName().equals(zzgemVar.getClass().getName())) {
            b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + strZzc + " with inconsistent public key type " + strZzc2);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzgeoVar.getClass().getName(), clsZzd.getName(), zzgemVar.getClass().getName()));
        }
        e(new ar6(zzgeoVar, zzgemVar), true);
        e(new zq6(zzgemVar), false);
    }

    public final synchronized void c(zzgem zzgemVar) {
        if (!zzgcy.zza(zzgemVar.zze())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgemVar.getClass()) + " as it is not FIPS compatible.");
        }
        e(new zq6(zzgemVar), false);
    }

    public final synchronized br6 d(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (br6) this.a.get(str);
    }

    public final synchronized void e(br6 br6Var, boolean z) {
        String strZzf = br6Var.zzb().zzf();
        br6 br6Var2 = (br6) this.a.get(strZzf);
        if (br6Var2 != null && !br6Var2.zzc().equals(br6Var.zzc())) {
            b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzf));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzf, br6Var2.zzc().getName(), br6Var.zzc().getName()));
        }
        if (z) {
            this.a.put(strZzf, br6Var);
        } else {
            this.a.putIfAbsent(strZzf, br6Var);
        }
    }

    public cr6(cr6 cr6Var) {
        this.a = new ConcurrentHashMap(cr6Var.a);
    }
}
