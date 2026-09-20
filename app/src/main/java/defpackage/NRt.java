package defpackage;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class NRt implements b91, qf6 {
    public static ej1 w;
    public static ej1 x;
    public static ej1 y;
    public static final /* synthetic */ NRt z = new NRt();
    public static final String[] A = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] B = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] C = {"items"};
    public static final String[] D = {"affiliation", "coupon", "creative_name", "creative_slot", InAppPurchaseMetaData.KEY_CURRENCY, "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", InAppPurchaseMetaData.KEY_PRICE, "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static final f34 b(x81 x81Var, j81 j81Var) {
        g42 g42Var = new g42(x81Var);
        sb5.d(1, j81Var);
        f34 f34Var = e34.a;
        return new f34(g42Var, j81Var);
    }

    @Override // defpackage.b91
    public Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        TW tw = (TW) obj4;
        LpT7Fixed lpT7 = (LpT7Fixed) obj3;
        w1L w1l = (w1L) obj2;
        int[] iArr = gR2r.QnHx.a;
        int i = ((Bs6V) obj).b;
        if (iArr[O.h(i)] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (iArr[O.h(i)] == 1) {
            return new Vb5(w1l.d, i, lpT7.a, tw.b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzl());
    }
}
