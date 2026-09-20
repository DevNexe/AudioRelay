package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.F1;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zaf;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class ik4 extends F1<zaf> implements pq5 {
    public final boolean G;
    public final os H;
    public final Bundle I;
    public final Integer J;

    public ik4(Context context, Looper looper, os osVar, Bundle bundle, com.google.android.gms.common.api.F1.QnHx qnHx, com.google.android.gms.common.api.F1.CQf cQf) {
        super(context, looper, 44, osVar, qnHx, cQf);
        this.G = true;
        this.H = osVar;
        this.I = bundle;
        this.J = osVar.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pq5
    public final void b(zae zaeVar) {
        GoogleSignInAccount googleSignInAccountF;
        if (zaeVar == null) {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
        int i = 0;
        try {
            Account account = this.H.a;
            if (account == null) {
                account = new Account(QnHx.DEFAULT_ACCOUNT, "com.google");
            }
            if (QnHx.DEFAULT_ACCOUNT.equals(account.name)) {
                au4 au4VarA = au4.a(getContext());
                ReentrantLock reentrantLock = au4VarA.a;
                reentrantLock.lock();
                try {
                    String string = au4VarA.b.getString("defaultGoogleSignInAccount", null);
                    reentrantLock.unlock();
                    if (!TextUtils.isEmpty(string)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 20);
                        sb.append("googleSignInAccount:");
                        sb.append(string);
                        String string2 = sb.toString();
                        ReentrantLock reentrantLock2 = au4VarA.a;
                        reentrantLock2.lock();
                        try {
                            String string3 = au4VarA.b.getString(string2, null);
                            reentrantLock2.unlock();
                            if (string3 != null) {
                                try {
                                    googleSignInAccountF = GoogleSignInAccount.f(string3);
                                } catch (JSONException unused) {
                                    googleSignInAccountF = null;
                                }
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    googleSignInAccountF = null;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } else {
                googleSignInAccountF = null;
            }
            Integer num = this.J;
            oa3.h(num);
            pr5 pr5Var = new pr5(2, account, num.intValue(), googleSignInAccountF);
            zaf zafVar = (zaf) getService();
            wq5 wq5Var = new wq5(1, pr5Var);
            zafVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(zafVar.x);
            int i2 = bq5.a;
            parcelObtain.writeInt(1);
            wq5Var.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(zaeVar.asBinder());
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                zafVar.w.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zact zactVar = (zact) zaeVar;
                zactVar.x.post(new iq5(i, zactVar, new zq5(1, new z50(8, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.pq5
    public final void c() {
        connect(new QnHx.LPt8Fixed());
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zaf ? (zaf) iInterfaceQueryLocalInterface : new zaf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final Bundle f() {
        os osVar = this.H;
        boolean zEquals = getContext().getPackageName().equals(osVar.f);
        Bundle bundle = this.I;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", osVar.f);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.QnHx, com.google.android.gms.common.api.QnHx.NUlFixed
    public final boolean requiresSignIn() {
        return this.G;
    }
}
