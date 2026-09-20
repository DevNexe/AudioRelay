package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public abstract class a16 {
    public static final zzcc a;

    static {
        zzcc zzcaVar = null;
        try {
            Object objNewInstance = zzau.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcaVar = iInterfaceQueryLocalInterface instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface : new zzca(iBinder);
                }
            } else {
                zzcgn.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzcgn.zzj("Failed to instantiate ClientApi class.");
        }
        a = zzcaVar;
    }

    public abstract Object a();

    public abstract Object b(zzcc zzccVar);

    public abstract Object c();

    public final Object d(Context context, boolean z) {
        Object objC;
        Object objB;
        if (!z) {
            zzaw.zzb();
            if (!zzcgg.zzr(context, 12451000)) {
                zzcgn.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z2 = false;
        boolean z3 = z | (!(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false)));
        zzbiy.zzc(context);
        if (((Boolean) zzbkj.zza.zze()).booleanValue()) {
            z3 = false;
        } else if (((Boolean) zzbkj.zzb.zze()).booleanValue()) {
            z3 = true;
            z2 = true;
        }
        zzcc zzccVar = a;
        Object objB2 = null;
        if (z3) {
            if (zzccVar != null) {
                try {
                    objB = b(zzccVar);
                } catch (RemoteException e) {
                    zzcgn.zzk("Cannot invoke local loader using ClientApi class.", e);
                    objB = null;
                }
                if (objB == null && !z2) {
                    try {
                        objB2 = c();
                    } catch (RemoteException e2) {
                        zzcgn.zzk("Cannot invoke remote loader.", e2);
                    }
                    objB = objB2;
                }
            } else {
                zzcgn.zzj("ClientApi class cannot be loaded.");
            }
            objB = null;
            if (objB == null) {
                objB2 = c();
                objB = objB2;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e3) {
                zzcgn.zzk("Cannot invoke remote loader.", e3);
                objC = null;
            }
            if (objC == null) {
                if (zzaw.zze().nextInt(((Long) zzbkw.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzaw.zzb().zzm(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
                }
            }
            if (objC == null) {
                if (zzccVar != null) {
                    try {
                        objB2 = b(zzccVar);
                    } catch (RemoteException e4) {
                        zzcgn.zzk("Cannot invoke local loader using ClientApi class.", e4);
                    }
                } else {
                    zzcgn.zzj("ClientApi class cannot be loaded.");
                }
                objB = objB2;
            } else {
                objB = objC;
            }
        }
        return objB == null ? a() : objB;
    }
}
