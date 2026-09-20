package defpackage;

import android.content.Context;
import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class lg6 {
    public static final jg6 A;
    public static final jg6 B;
    public static final jg6 C;
    public static final jg6 D;
    public static final jg6 E;
    public static final jg6 F;
    public static final jg6 G;
    public static final jg6 H;
    public static final jg6 I;
    public static final jg6 J;
    public static final jg6 K;
    public static final jg6 L;
    public static final jg6 M;
    public static final jg6 N;
    public static final jg6 O;
    public static final jg6 P;
    public static final jg6 Q;
    public static final jg6 R;
    public static final jg6 S;
    public static final jg6 T;
    public static final jg6 U;
    public static final jg6 V;
    public static final jg6 W;
    public static final jg6 X;
    public static final jg6 Y;
    public static final jg6 Z;
    public static final jg6 a0;
    public static final jg6 b0;
    public static final jg6 c0;
    public static final jg6 d0;
    public static final jg6 e0;
    public static final jg6 f0;
    public static final jg6 g0;
    public static final jg6 h0;
    public static final jg6 i0;
    public static final jg6 j0;
    public static final jg6 k;
    public static final jg6 k0;
    public static final jg6 l;
    public static final jg6 l0;
    public static final jg6 m;
    public static final jg6 m0;
    public static final jg6 n;
    public static final jg6 n0;
    public static final jg6 o;
    public static final jg6 o0;
    public static final jg6 p;
    public static final jg6 p0;
    public static final jg6 q;
    public static final jg6 q0;
    public static final jg6 r;
    public static final jg6 r0;
    public static final jg6 s;
    public static final jg6 s0;
    public static final jg6 t;
    public static final jg6 t0;
    public static final jg6 u;
    public static final jg6 u0;
    public static final jg6 v;
    public static final jg6 v0;
    public static final jg6 w;
    public static final jg6 w0;
    public static final jg6 x;
    public static final jg6 x0;
    public static final jg6 y;
    public static final jg6 y0;
    public static final jg6 z;
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final Set b = Collections.synchronizedSet(new HashSet());
    public static final jg6 c = a("measurement.ad_id_cache_time", 10000L, 10000L, g7.J);
    public static final jg6 d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, Cz.C);
    public static final jg6 e = a("measurement.config.cache_time", 86400000L, 3600000L, xApe.V);
    public static final jg6 f = a("measurement.config.url_scheme", "https", "https", qLd.G);
    public static final jg6 g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new qf6() { // from class: x96
        @Override // defpackage.qf6
        public final Object zza() {
            List list = lg6.a;
            return b67.x.zza().zzH();
        }
    });
    public static final jg6 h = a("measurement.upload.max_bundles", 100, 100, new qf6() { // from class: uc6
        @Override // defpackage.qf6
        public final Object zza() {
            List list = lg6.a;
            return Integer.valueOf((int) b67.x.zza().zzv());
        }
    });
    public static final jg6 i = a("measurement.upload.max_batch_size", 65536, 65536, new qf6() { // from class: he6
        @Override // defpackage.qf6
        public final Object zza() {
            List list = lg6.a;
            return Integer.valueOf((int) b67.x.zza().zzD());
        }
    });
    public static final jg6 j = a("measurement.upload.max_bundle_size", 65536, 65536, new qf6() { // from class: ue6
        @Override // defpackage.qf6
        public final Object zza() {
            List list = lg6.a;
            return Integer.valueOf((int) b67.x.zza().zzu());
        }
    });

    static {
        Integer numValueOf = Integer.valueOf(AdError.NETWORK_ERROR_CODE);
        k = a("measurement.upload.max_events_per_bundle", numValueOf, numValueOf, new qf6() { // from class: xe6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Integer.valueOf((int) b67.x.zza().zzy());
            }
        });
        l = a("measurement.upload.max_events_per_day", 100000, 100000, new qf6() { // from class: af6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Integer.valueOf((int) b67.x.zza().zzz());
            }
        });
        m = a("measurement.upload.max_error_events_per_day", numValueOf, numValueOf, new qf6() { // from class: c66
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Integer.valueOf((int) b67.x.zza().zzx());
            }
        });
        n = a("measurement.upload.max_public_events_per_day", 50000, 50000, ym.H);
        o = a("measurement.upload.max_conversions_per_day", 10000, 10000, YKK.G);
        p = a("measurement.upload.max_realtime_events_per_day", 10, 10, new qf6() { // from class: qd6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Integer.valueOf((int) b67.x.zza().zzC());
            }
        });
        q = a("measurement.store.max_stored_events_per_app", 100000, 100000, S12N.B);
        r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new qf6() { // from class: ff6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return b67.x.zza().zzJ();
            }
        });
        s = a("measurement.upload.backoff_period", 43200000L, 43200000L, new qf6() { // from class: gf6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Long.valueOf(b67.x.zza().zzr());
            }
        });
        t = a("measurement.upload.window_interval", 3600000L, 3600000L, new qf6() { // from class: jf6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Long.valueOf(b67.x.zza().zzG());
            }
        });
        u = a("measurement.upload.interval", 3600000L, 3600000L, Th.Y);
        v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, NRt.z);
        w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, m57.E);
        x = a("measurement.upload.minimum_delay", 500L, 500L, r1.z);
        y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, ob.z);
        z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, XTd3.y);
        A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, eu.B);
        B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, bx0.y);
        C = a("measurement.upload.retry_time", 1800000L, 1800000L, fa3.w);
        D = a("measurement.upload.retry_count", 6, 6, ko6.B);
        E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, OW8.J);
        F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, a73.w);
        Integer numValueOf2 = Integer.valueOf(RCHTTPStatusCodes.SUCCESS);
        G = a("measurement.audience.filter_result_max_count", numValueOf2, numValueOf2, zc1.y);
        H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        Integer numValueOf3 = Integer.valueOf(RCHTTPStatusCodes.ERROR);
        I = a("measurement.upload.max_event_name_cardinality", numValueOf3, numValueOf3, null);
        J = a("measurement.upload.max_public_event_params", 25, 25, null);
        K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C0239D.B);
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, new qf6() { // from class: h56
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(u77.x.zza().zze());
            }
        });
        M = a("measurement.test.string_flag", "---", "---", new qf6() { // from class: n56
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return u77.x.zza().zzd();
            }
        });
        N = a("measurement.test.long_flag", -1L, -1L, qe0.z);
        O = a("measurement.test.int_flag", -2, -2, new qf6() { // from class: v56
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Integer.valueOf((int) u77.x.zza().zzb());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", dValueOf, dValueOf, i32.w);
        Q = a("measurement.experiment.max_ids", 50, 50, m21.U);
        R = a("measurement.max_bundles_per_iteration", 100, 100, ps0.x);
        S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, v23.w);
        T = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new qf6() { // from class: l76
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Long.valueOf(b67.x.zza().zzq());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, ix1.y);
        U = a("measurement.quality.checksum", bool, bool, null);
        V = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new qf6() { // from class: s76
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((q67) o67.x.w.zza()).zzc());
            }
        });
        W = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new qf6() { // from class: v76
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((q67) o67.x.w.zza()).zzb());
            }
        });
        X = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, fXUx.A);
        Y = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new qf6() { // from class: k86
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((c97) b97.x.w.zza()).zza());
            }
        });
        Z = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new qf6() { // from class: t86
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((n77) l77.x.w.zza()).zza());
            }
        });
        a0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, AY.B);
        b0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new qf6() { // from class: h96
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((y87) x87.x.w.zza()).zzb());
            }
        });
        c0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, fTO$.C);
        d0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, v3A.z);
        e0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new qf6() { // from class: ra6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((e77) c77.x.w.zza()).zzb());
            }
        });
        a("measurement.collection.synthetic_data_mitigation", bool, bool, new qf6() { // from class: ua6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((u87) t87.x.w.zza()).zza());
            }
        });
        f0 = a("measurement.service.storage_consent_support_version", 203600, 203600, FNO9.B);
        a("measurement.client.click_identifier_control.dev", bool, bool, new qf6() { // from class: pb6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((w57) v57.x.w.zza()).zza());
            }
        });
        a("measurement.service.click_identifier_control", bool, bool, new qf6() { // from class: yb6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((z57) y57.x.w.zza()).zza());
            }
        });
        g0 = a("measurement.service.store_null_safelist", bool2, bool2, X.x);
        h0 = a("measurement.service.store_safelist", bool2, bool2, new qf6() { // from class: kc6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((i67) h67.x.w.zza()).zzc());
            }
        });
        i0 = a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, new qf6() { // from class: mc6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzj());
            }
        });
        j0 = a("measurement.redaction.config_redacted_fields", bool2, bool2, new qf6() { // from class: pc6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzd());
            }
        });
        k0 = a("measurement.redaction.upload_redacted_fields", bool2, bool2, new qf6() { // from class: xc6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzm());
            }
        });
        l0 = a("measurement.redaction.upload_subdomain_override", bool2, bool2, new qf6() { // from class: bd6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzn());
            }
        });
        m0 = a("measurement.redaction.device_info", bool2, bool2, new qf6() { // from class: md6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zze());
            }
        });
        n0 = a("measurement.redaction.user_id", bool2, bool2, ddf.y);
        o0 = a("measurement.redaction.google_signals", bool2, bool2, new qf6() { // from class: ud6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzi());
            }
        });
        p0 = a("measurement.collection.enable_session_stitching_token.service", bool, bool, new qf6() { // from class: vd6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((q87) g87.x.w.zza()).zzc());
            }
        });
        q0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, new qf6() { // from class: wd6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((q87) g87.x.w.zza()).zzb());
            }
        });
        r0 = a("measurement.redaction.app_instance_id", bool2, bool2, new qf6() { // from class: yd6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzb());
            }
        });
        s0 = a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, new qf6() { // from class: ae6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzh());
            }
        });
        t0 = a("measurement.redaction.enhanced_uid", bool2, bool2, new qf6() { // from class: fe6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzg());
            }
        });
        u0 = a("measurement.redaction.e_tag", bool2, bool2, new qf6() { // from class: je6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(c87.x.zza().zzf());
            }
        });
        v0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, kK.z);
        w0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, FWT.B);
        a("measurement.redaction.scion_payload_generator", bool2, bool2, o70.B);
        x0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new qf6() { // from class: se6
            @Override // defpackage.qf6
            public final Object zza() {
                List list = lg6.a;
                return Boolean.valueOf(((y67) x67.x.w.zza()).zzb());
            }
        });
        y0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, fp1.y);
    }

    public static jg6 a(String str, Object obj, Object obj2, qf6 qf6Var) {
        jg6 jg6Var = new jg6(str, obj, obj2, qf6Var);
        a.add(jg6Var);
        return jg6Var;
    }

    public static Map b(Context context) {
        xw6 xw6VarA = xw6.a(context.getContentResolver(), lx6.a(), new Runnable() { // from class: j26
            @Override // java.lang.Runnable
            public final void run() {
                ay6.h.incrementAndGet();
            }
        });
        return xw6VarA == null ? Collections.emptyMap() : xw6VarA.b();
    }
}
