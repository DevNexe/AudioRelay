package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.QnHx.F1;
import com.google.android.gms.common.internal.IAccountAccessor;
import defpackage.lu2;
import defpackage.os;
import defpackage.tw0;
import defpackage.v50;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx<O extends F1> {
    public final AbstractC0074QnHx<?, O> a;
    public final String b;

    public static class CQf<C> {
    }

    public interface F1 {
        public static final C0072F1 a = new C0072F1(0);

        public interface CQf extends F1 {
            GoogleSignInAccount a();
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.QnHx$F1$F1, reason: collision with other inner class name */
        public static final class C0072F1 implements F1 {
            public C0072F1() {
            }

            public /* synthetic */ C0072F1(int i) {
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.QnHx$F1$QnHx, reason: collision with other inner class name */
        public interface InterfaceC0073QnHx extends F1 {
            Account b();
        }
    }

    public static abstract class LPt8Fixed<T, O> {
    }

    public interface NUlFixed {
        Set<Scope> a();

        void connect(com.google.android.gms.common.internal.QnHx.F1 f1);

        void disconnect();

        void disconnect(String str);

        tw0[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(com.google.android.gms.common.internal.QnHx.NUlFixed nUl);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.QnHx$QnHx, reason: collision with other inner class name */
    public static abstract class AbstractC0074QnHx<T extends NUlFixed, O> extends LPt8Fixed<T, O> {
        public NUlFixed a(Context context, Looper looper, os osVar, F1 f1, v50 v50Var, lu2 lu2Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        public NUlFixed b(Context context, Looper looper, os osVar, F1 f1, com.google.android.gms.common.api.F1.QnHx qnHx, com.google.android.gms.common.api.F1.CQf cQf) {
            return a(context, looper, osVar, f1, qnHx, cQf);
        }
    }

    public static final class YKK<C extends NUlFixed> extends CQf<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends NUlFixed> QnHx(String str, AbstractC0074QnHx<C, O> abstractC0074QnHx, YKK<C> ykk) {
        this.b = str;
        this.a = abstractC0074QnHx;
    }
}
