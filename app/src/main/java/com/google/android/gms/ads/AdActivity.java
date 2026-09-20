package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public zzbza w;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null && !zzbzaVar.zzE()) {
                return;
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbza zzbzaVar2 = this.w;
            if (zzbzaVar2 != null) {
                zzbzaVar2.zzh();
            }
        } catch (RemoteException e2) {
            zzcgn.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzj(new ObjectWrapper(configuration));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbza zzbzaVarZzn = zzaw.zza().zzn(this);
        this.w = zzbzaVarZzn;
        if (zzbzaVarZzn == null) {
            zzcgn.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbzaVarZzn.zzk(bundle);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzl();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzn();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzo();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzp();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzq(bundle);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzr();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzs();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbza zzbzaVar = this.w;
            if (zzbzaVar != null) {
                zzbzaVar.zzt();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zzbza zzbzaVar = this.w;
        if (zzbzaVar != null) {
            try {
                zzbzaVar.zzv();
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzbza zzbzaVar = this.w;
        if (zzbzaVar != null) {
            try {
                zzbzaVar.zzv();
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbza zzbzaVar = this.w;
        if (zzbzaVar != null) {
            try {
                zzbzaVar.zzv();
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
