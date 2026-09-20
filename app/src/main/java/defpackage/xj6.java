package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class xj6 extends sv6 {
    public static final Pair w = new Pair("", 0L);
    public SharedPreferences c;
    public rj6 d;
    public final bj6 e;
    public final tj6 f;
    public String g;
    public boolean h;
    public long i;
    public final bj6 j;
    public final ui6 k;
    public final tj6 l;
    public final ui6 m;
    public final bj6 n;
    public boolean o;
    public final ui6 p;
    public final ui6 q;
    public final bj6 r;
    public final tj6 s;
    public final tj6 t;
    public final bj6 u;
    public final zi6 v;

    public xj6(dq6 dq6Var) {
        super(dq6Var);
        this.j = new bj6(this, "session_timeout", 1800000L);
        this.k = new ui6(this, "start_new_session", true);
        this.n = new bj6(this, "last_pause_time", 0L);
        this.l = new tj6(this, "non_personalized_ads");
        this.m = new ui6(this, "allow_remote_dynamite", false);
        this.e = new bj6(this, "first_open_time", 0L);
        oa3.e("app_install_time");
        this.f = new tj6(this, "app_instance_id");
        this.p = new ui6(this, "app_backgrounded", false);
        this.q = new ui6(this, "deep_link_retrieval_complete", false);
        this.r = new bj6(this, "deep_link_retrieval_attempts", 0L);
        this.s = new tj6(this, "firebase_feature_rollouts");
        this.t = new tj6(this, "deferred_attribution_cache");
        this.u = new bj6(this, "deferred_attribution_cache_timestamp", 0L);
        this.v = new zi6(this);
    }

    @Override // defpackage.sv6
    public final boolean f() {
        return true;
    }

    public final SharedPreferences i() {
        e();
        g();
        oa3.h(this.c);
        return this.c;
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void j() {
        SharedPreferences sharedPreferences = this.a.a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.o = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.d = new rj6(this, Math.max(0L, ((Long) lg6.d.a(null)).longValue()));
    }

    public final ww5 k() {
        e();
        return ww5.b(i().getString("consent_settings", "G1"));
    }

    public final Boolean l() {
        e();
        if (i().contains("measurement_enabled")) {
            return Boolean.valueOf(i().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void m(Boolean bool) {
        e();
        SharedPreferences.Editor editorEdit = i().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final void n(boolean z) {
        e();
        bi6 bi6Var = this.a.i;
        dq6.h(bi6Var);
        bi6Var.n.c(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean o(long j) {
        return j - this.j.a() > this.n.a();
    }

    public final boolean p(int i) {
        int i2 = i().getInt("consent_source", 100);
        ww5 ww5Var = ww5.b;
        return i <= i2;
    }
}
