package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d67 implements c67 {
    public static final ox6 A;
    public static final ox6 B;
    public static final ox6 C;
    public static final ox6 D;
    public static final ox6 E;
    public static final ox6 F;
    public static final ox6 G;
    public static final ox6 H;
    public static final rx6 I;
    public static final ox6 J;
    public static final ox6 a;
    public static final ox6 b;
    public static final ox6 c;
    public static final rx6 d;
    public static final rx6 e;
    public static final ox6 f;
    public static final ox6 g;
    public static final ox6 h;
    public static final ox6 i;
    public static final ox6 j;
    public static final ox6 k;
    public static final ox6 l;
    public static final ox6 m;
    public static final ox6 n;
    public static final ox6 o;
    public static final ox6 p;
    public static final ox6 q;
    public static final ox6 r;
    public static final ox6 s;
    public static final ox6 t;
    public static final ox6 u;
    public static final ox6 v;
    public static final ox6 w;
    public static final ox6 x;
    public static final ox6 y;
    public static final ox6 z;

    static {
        tx6 tx6Var = new tx6(lx6.a(), false, true);
        a = tx6Var.a("measurement.ad_id_cache_time", 10000L);
        b = tx6Var.a("measurement.max_bundles_per_iteration", 100L);
        c = tx6Var.a("measurement.config.cache_time", 86400000L);
        tx6Var.b("measurement.log_tag", "FA");
        d = new rx6(tx6Var, "measurement.config.url_authority", "app-measurement.com");
        e = new rx6(tx6Var, "measurement.config.url_scheme", "https");
        f = tx6Var.a("measurement.upload.debug_upload_interval", 1000L);
        g = tx6Var.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        h = tx6Var.a("measurement.store.max_stored_events_per_app", 100000L);
        i = tx6Var.a("measurement.experiment.max_ids", 50L);
        j = tx6Var.a("measurement.audience.filter_result_max_count", 200L);
        k = tx6Var.a("measurement.alarm_manager.minimum_interval", 60000L);
        l = tx6Var.a("measurement.upload.minimum_delay", 500L);
        m = tx6Var.a("measurement.monitoring.sample_period_millis", 86400000L);
        n = tx6Var.a("measurement.upload.realtime_upload_interval", 10000L);
        o = tx6Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        tx6Var.a("measurement.config.cache_time.service", 3600000L);
        p = tx6Var.a("measurement.service_client.idle_disconnect_millis", 5000L);
        tx6Var.b("measurement.log_tag.service", "FA-SVC");
        q = tx6Var.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        r = tx6Var.a("measurement.sdk.attribution.cache.ttl", 604800000L);
        s = tx6Var.a("measurement.redaction.app_instance_id.ttl", 7200000L);
        t = tx6Var.a("measurement.upload.backoff_period", 43200000L);
        u = tx6Var.a("measurement.upload.initial_upload_delay_time", 15000L);
        v = tx6Var.a("measurement.upload.interval", 3600000L);
        w = tx6Var.a("measurement.upload.max_bundle_size", 65536L);
        x = tx6Var.a("measurement.upload.max_bundles", 100L);
        y = tx6Var.a("measurement.upload.max_conversions_per_day", 500L);
        z = tx6Var.a("measurement.upload.max_error_events_per_day", 1000L);
        A = tx6Var.a("measurement.upload.max_events_per_bundle", 1000L);
        B = tx6Var.a("measurement.upload.max_events_per_day", 100000L);
        C = tx6Var.a("measurement.upload.max_public_events_per_day", 50000L);
        D = tx6Var.a("measurement.upload.max_queue_time", 2419200000L);
        E = tx6Var.a("measurement.upload.max_realtime_events_per_day", 10L);
        F = tx6Var.a("measurement.upload.max_batch_size", 65536L);
        G = tx6Var.a("measurement.upload.retry_count", 6L);
        H = tx6Var.a("measurement.upload.retry_time", 1800000L);
        I = new rx6(tx6Var, "measurement.upload.url", "https://app-measurement.com/a");
        J = tx6Var.a("measurement.upload.window_interval", 3600000L);
    }

    @Override // defpackage.c67
    public final long zzA() {
        return ((Long) C.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzB() {
        return ((Long) D.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzC() {
        return ((Long) E.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzD() {
        return ((Long) F.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzE() {
        return ((Long) G.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzF() {
        return ((Long) H.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzG() {
        return ((Long) J.b()).longValue();
    }

    @Override // defpackage.c67
    public final String zzH() {
        return (String) d.b();
    }

    @Override // defpackage.c67
    public final String zzI() {
        return (String) e.b();
    }

    @Override // defpackage.c67
    public final String zzJ() {
        return (String) I.b();
    }

    @Override // defpackage.c67
    public final long zza() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzb() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzc() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzd() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zze() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzf() {
        return ((Long) h.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzg() {
        return ((Long) i.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzh() {
        return ((Long) j.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzi() {
        return ((Long) k.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzj() {
        return ((Long) l.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzk() {
        return ((Long) m.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzl() {
        return ((Long) n.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzm() {
        return ((Long) o.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzn() {
        return ((Long) p.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzo() {
        return ((Long) q.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzp() {
        return ((Long) r.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzq() {
        return ((Long) s.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzr() {
        return ((Long) t.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzs() {
        return ((Long) u.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzt() {
        return ((Long) v.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzu() {
        return ((Long) w.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzv() {
        return ((Long) x.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzw() {
        return ((Long) y.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzx() {
        return ((Long) z.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzy() {
        return ((Long) A.b()).longValue();
    }

    @Override // defpackage.c67
    public final long zzz() {
        return ((Long) B.b()).longValue();
    }
}
