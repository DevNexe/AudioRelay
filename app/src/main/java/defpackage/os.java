package defpackage;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class os {

    @Nullable
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<com.google.android.gms.common.api.QnHx<?>, kp5> d;

    @Nullable
    public final View e;
    public final String f;
    public final String g;
    public final jk4 h;
    public Integer i;

    public static final class QnHx {

        @Nullable
        public Account a;
        public Q6g<Scope> b;
        public String c;
        public String d;
    }

    public os(@Nullable Account account, Q6g q6g, String str, String str2) {
        jk4 jk4Var = jk4.b;
        this.a = account;
        Set<Scope> setEmptySet = q6g == null ? Collections.emptySet() : Collections.unmodifiableSet(q6g);
        this.b = setEmptySet;
        Map<com.google.android.gms.common.api.QnHx<?>, kp5> mapEmptyMap = Collections.emptyMap();
        this.d = mapEmptyMap;
        this.e = null;
        this.f = str;
        this.g = str2;
        this.h = jk4Var;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<kp5> it = mapEmptyMap.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
