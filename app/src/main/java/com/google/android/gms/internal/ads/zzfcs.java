package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcs {
    public final String zzA;
    public final zzcdl zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfdq zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbzg zzae;
    public final boolean zzaf;
    public final com.google.android.gms.ads.internal.client.zzs zzag;
    public final String zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final JSONObject zzal;
    public final boolean zzam;
    public final String zzan;
    public final boolean zzao;
    public final String zzap;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzccc zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfcx zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:216:0x0540 A[PHI: r81
  0x0540: PHI (r81v70 java.util.List) = 
  (r81v1 java.util.List)
  (r81v2 java.util.List)
  (r81v3 java.util.List)
  (r81v4 java.util.List)
  (r81v5 java.util.List)
  (r81v6 java.util.List)
  (r81v7 java.util.List)
  (r81v8 java.util.List)
  (r81v9 java.util.List)
  (r81v10 java.util.List)
  (r81v11 java.util.List)
  (r81v12 java.util.List)
  (r81v13 java.util.List)
  (r81v14 java.util.List)
  (r81v15 java.util.List)
  (r81v16 java.util.List)
  (r81v17 java.util.List)
  (r81v18 java.util.List)
  (r81v19 java.util.List)
  (r81v20 java.util.List)
  (r81v21 java.util.List)
  (r81v22 java.util.List)
  (r81v23 java.util.List)
  (r81v24 java.util.List)
  (r81v25 java.util.List)
  (r81v26 java.util.List)
  (r81v27 java.util.List)
  (r81v28 java.util.List)
  (r81v29 java.util.List)
  (r81v30 java.util.List)
  (r81v31 java.util.List)
  (r81v32 java.util.List)
  (r81v33 java.util.List)
  (r81v34 java.util.List)
  (r81v35 java.util.List)
  (r81v36 java.util.List)
  (r81v37 java.util.List)
  (r81v38 java.util.List)
  (r81v39 java.util.List)
  (r81v40 java.util.List)
  (r81v41 java.util.List)
  (r81v42 java.util.List)
  (r81v43 java.util.List)
  (r81v44 java.util.List)
  (r81v45 java.util.List)
  (r81v46 java.util.List)
  (r81v47 java.util.List)
  (r81v48 java.util.List)
  (r81v49 java.util.List)
  (r81v50 java.util.List)
  (r81v51 java.util.List)
  (r81v52 java.util.List)
  (r81v53 java.util.List)
  (r81v54 java.util.List)
  (r81v55 java.util.List)
  (r81v56 java.util.List)
  (r81v57 java.util.List)
  (r81v58 java.util.List)
  (r81v59 java.util.List)
  (r81v60 java.util.List)
  (r81v61 java.util.List)
  (r81v62 java.util.List)
  (r81v63 java.util.List)
  (r81v64 java.util.List)
  (r81v65 java.util.List)
  (r81v66 java.util.List)
  (r81v67 java.util.List)
  (r81v68 java.util.List)
  (r81v71 java.util.List)
 binds: [B:214:0x053b, B:211:0x052c, B:208:0x051d, B:205:0x050e, B:202:0x04ff, B:199:0x04f0, B:196:0x04e1, B:193:0x04d1, B:190:0x04c1, B:187:0x04b1, B:184:0x04a1, B:181:0x0491, B:178:0x0481, B:175:0x0471, B:172:0x0461, B:169:0x0451, B:166:0x0441, B:163:0x0431, B:160:0x0421, B:157:0x0411, B:154:0x0401, B:151:0x03f2, B:148:0x03e2, B:145:0x03d2, B:142:0x03c2, B:139:0x03b2, B:136:0x03a2, B:133:0x0392, B:130:0x0382, B:127:0x0373, B:124:0x0363, B:121:0x0354, B:118:0x0344, B:115:0x0334, B:112:0x0324, B:109:0x0314, B:106:0x0304, B:103:0x02f4, B:100:0x02e4, B:97:0x02d4, B:94:0x02c4, B:91:0x02b4, B:88:0x02a4, B:85:0x0294, B:82:0x0284, B:79:0x0274, B:76:0x0264, B:73:0x0254, B:70:0x0245, B:67:0x0235, B:64:0x0225, B:61:0x0215, B:58:0x0205, B:55:0x01f6, B:52:0x01e6, B:49:0x01d6, B:46:0x01c6, B:43:0x01b6, B:40:0x01a6, B:37:0x0196, B:34:0x0187, B:31:0x0177, B:28:0x0168, B:25:0x0158, B:22:0x0149, B:19:0x0139, B:16:0x0129, B:13:0x0119, B:11:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    public zzfcs(JsonReader jsonReader) throws IOException {
        List list;
        byte b;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        List listEmptyList7 = Collections.emptyList();
        List listEmptyList8 = Collections.emptyList();
        List listEmptyList9 = Collections.emptyList();
        List listEmptyList10 = Collections.emptyList();
        List listEmptyList11 = Collections.emptyList();
        List listEmptyList12 = Collections.emptyList();
        List listEmptyList13 = Collections.emptyList();
        List listEmptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfuv zzfuvVarZzo = zzfuv.zzo();
        jsonReader.beginObject();
        JSONObject jSONObjectZzh = jSONObject;
        JSONObject jSONObjectZzh2 = jSONObject2;
        JSONObject jSONObjectZzh3 = jSONObject3;
        JSONObject jSONObjectZzh4 = jSONObject4;
        JSONObject jSONObjectZzh5 = jSONObject5;
        JSONObject jSONObjectZzh6 = jSONObject6;
        List listZzd = zzfuvVarZzo;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String string = strNextString5;
        String strNextString6 = string;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        zzccc zzcccVarZza = null;
        zzfcx zzfcxVar = null;
        zzcdl zzcdlVarZza = null;
        zzbzg zzbzgVarZza = null;
        com.google.android.gms.ads.internal.client.zzs zzsVarZza = null;
        String strNextString17 = null;
        int i = 0;
        int i2 = 0;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int i3 = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = true;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        List listA = listEmptyList14;
        List listZzd2 = listEmptyList13;
        List listA2 = listEmptyList12;
        List listZzd3 = listEmptyList11;
        List listZzd4 = listEmptyList10;
        List listZzd5 = listEmptyList9;
        List listZzd6 = listEmptyList8;
        List listZzd7 = listEmptyList7;
        List listZzd8 = listEmptyList6;
        List listZzd9 = listEmptyList5;
        List listZzd10 = listEmptyList4;
        List listZzd11 = listEmptyList3;
        List listZzd12 = listEmptyList2;
        List listZzd13 = listEmptyList;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listA;
                    if (!str.equals("ad_source_instance_name")) {
                        b = -1;
                    } else {
                        b = 58;
                    }
                    break;
                case -1980587809:
                    list = listA;
                    if (!str.equals("debug_signals")) {
                        b = -1;
                    } else {
                        b = 28;
                    }
                    break;
                case -1965512151:
                    list = listA;
                    if (!str.equals("omid_settings")) {
                        b = -1;
                    } else {
                        b = 41;
                    }
                    break;
                case -1812055556:
                    list = listA;
                    if (!str.equals("play_prewarm_options")) {
                        b = -1;
                    } else {
                        b = 49;
                    }
                    break;
                case -1776946669:
                    list = listA;
                    if (!str.equals("ad_source_name")) {
                        b = -1;
                    } else {
                        b = 56;
                    }
                    break;
                case -1662989631:
                    list = listA;
                    if (!str.equals("is_interscroller")) {
                        b = -1;
                    } else {
                        b = 53;
                    }
                    break;
                case -1620470467:
                    list = listA;
                    if (!str.equals("backend_query_id")) {
                        b = -1;
                    } else {
                        b = 47;
                    }
                    break;
                case -1550155393:
                    list = listA;
                    if (!str.equals("nofill_urls")) {
                        b = -1;
                    } else {
                        b = 13;
                    }
                    break;
                case -1440104884:
                    list = listA;
                    if (!str.equals("is_custom_close_blocked")) {
                        b = -1;
                    } else {
                        b = 35;
                    }
                    break;
                case -1439500848:
                    list = listA;
                    if (!str.equals(AdUnitActivity.EXTRA_ORIENTATION)) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case -1428969291:
                    list = listA;
                    if (!str.equals("enable_omid")) {
                        b = -1;
                    } else {
                        b = 39;
                    }
                    break;
                case -1406227629:
                    list = listA;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b = -1;
                    } else {
                        b = 66;
                    }
                    break;
                case -1403779768:
                    list = listA;
                    if (!str.equals("showable_impression_type")) {
                        b = -1;
                    } else {
                        b = 44;
                    }
                    break;
                case -1375413093:
                    list = listA;
                    if (!str.equals("ad_cover")) {
                        b = -1;
                    } else {
                        b = 54;
                    }
                    break;
                case -1360811658:
                    list = listA;
                    if (!str.equals("ad_sizes")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -1306015996:
                    list = listA;
                    if (!str.equals("adapters")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case -1303332046:
                    list = listA;
                    if (!str.equals("test_mode_enabled")) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -1289032093:
                    list = listA;
                    if (!str.equals("extras")) {
                        b = -1;
                    } else {
                        b = 29;
                    }
                    break;
                case -1240082064:
                    list = listA;
                    if (!str.equals("ad_event_value")) {
                        b = -1;
                    } else {
                        b = 51;
                    }
                    break;
                case -1234181075:
                    list = listA;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b = -1;
                    } else {
                        b = 30;
                    }
                    break;
                case -1168140544:
                    list = listA;
                    if (!str.equals("presentation_error_urls")) {
                        b = -1;
                    } else {
                        b = 14;
                    }
                    break;
                case -1152230954:
                    list = listA;
                    if (!str.equals("ad_type")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1146534047:
                    list = listA;
                    if (!str.equals("is_scroll_aware")) {
                        b = -1;
                    } else {
                        b = 43;
                    }
                    break;
                case -1115838944:
                    list = listA;
                    if (!str.equals("fill_urls")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case -1081936678:
                    list = listA;
                    if (!str.equals("allocation_id")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case -1078050970:
                    list = listA;
                    if (!str.equals("video_complete_urls")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -1051269058:
                    list = listA;
                    if (!str.equals("active_view")) {
                        b = -1;
                    } else {
                        b = 25;
                    }
                    break;
                case -982608540:
                    list = listA;
                    if (!str.equals("valid_from_timestamp")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case -972056451:
                    list = listA;
                    if (!str.equals("ad_source_instance_id")) {
                        b = -1;
                    } else {
                        b = 59;
                    }
                    break;
                case -776859333:
                    list = listA;
                    if (!str.equals("click_urls")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -544216775:
                    list = listA;
                    if (!str.equals("safe_browsing")) {
                        b = -1;
                    } else {
                        b = 26;
                    }
                    break;
                case -437057161:
                    list = listA;
                    if (!str.equals("imp_urls")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -404433734:
                    list = listA;
                    if (!str.equals("rtb_native_required_assets")) {
                        b = -1;
                    } else {
                        b = 61;
                    }
                    break;
                case -404326515:
                    list = listA;
                    if (!str.equals("render_timeout_ms")) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case -397704715:
                    list = listA;
                    if (!str.equals("ad_close_time_ms")) {
                        b = -1;
                    } else {
                        b = 45;
                    }
                    break;
                case -388807511:
                    list = listA;
                    if (!str.equals("content_url")) {
                        b = -1;
                    } else {
                        b = 63;
                    }
                    break;
                case -369773488:
                    list = listA;
                    if (!str.equals("is_close_button_enabled")) {
                        b = -1;
                    } else {
                        b = 50;
                    }
                    break;
                case -213449460:
                    list = listA;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b = -1;
                    } else {
                        b = 64;
                    }
                    break;
                case -213424028:
                    list = listA;
                    if (!str.equals("watermark")) {
                        b = -1;
                    } else {
                        b = 46;
                    }
                    break;
                case -180214626:
                    list = listA;
                    if (!str.equals("native_required_asset_viewability")) {
                        b = -1;
                    } else {
                        b = 62;
                    }
                    break;
                case -154616268:
                    list = listA;
                    if (!str.equals("is_offline_ad")) {
                        b = -1;
                    } else {
                        b = 60;
                    }
                    break;
                case -29338502:
                    list = listA;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case 3107:
                    list = listA;
                    if (!str.equals("ad")) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 3355:
                    list = listA;
                    if (!str.equals(FacebookAdapter.KEY_ID)) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 3076010:
                    list = listA;
                    if (!str.equals("data")) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 37109963:
                    list = listA;
                    if (!str.equals("request_id")) {
                        b = -1;
                    } else {
                        b = 67;
                    }
                    break;
                case 63195984:
                    list = listA;
                    if (!str.equals("render_test_label")) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 107433883:
                    list = listA;
                    if (!str.equals("qdata")) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case 230323073:
                    list = listA;
                    if (!str.equals("ad_load_urls")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 418392395:
                    list = listA;
                    if (!str.equals("is_closable_area_disabled")) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 549176928:
                    list = listA;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 597473788:
                    list = listA;
                    if (!str.equals("debug_dialog_string")) {
                        b = -1;
                    } else {
                        b = 27;
                    }
                    break;
                case 754887508:
                    list = listA;
                    if (!str.equals("container_sizes")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 791122864:
                    list = listA;
                    if (!str.equals("impression_type")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1010584092:
                    list = listA;
                    if (!str.equals("transaction_id")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1100650276:
                    list = listA;
                    if (!str.equals("rewards")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 1186014765:
                    list = listA;
                    if (!str.equals("cache_hit_urls")) {
                        b = -1;
                    } else {
                        b = 65;
                    }
                    break;
                case 1321720943:
                    list = listA;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b = -1;
                    } else {
                        b = 31;
                    }
                    break;
                case 1437255331:
                    list = listA;
                    if (!str.equals("ad_source_id")) {
                        b = -1;
                    } else {
                        b = 57;
                    }
                    break;
                case 1637553475:
                    list = listA;
                    if (!str.equals("bid_response")) {
                        b = -1;
                    } else {
                        b = 40;
                    }
                    break;
                case 1638957285:
                    list = listA;
                    if (!str.equals("video_start_urls")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1686319423:
                    list = listA;
                    if (!str.equals("ad_network_class_name")) {
                        b = -1;
                    } else {
                        b = 55;
                    }
                    break;
                case 1688341040:
                    list = listA;
                    if (!str.equals("video_reward_urls")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1799285870:
                    list = listA;
                    if (!str.equals("use_third_party_container_height")) {
                        b = -1;
                    } else {
                        b = 48;
                    }
                    break;
                case 1839650832:
                    list = listA;
                    if (!str.equals("renderers")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1875425491:
                    list = listA;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b = -1;
                    } else {
                        b = 42;
                    }
                    break;
                case 2068142375:
                    list = listA;
                    if (!str.equals("rule_line_external_id")) {
                        b = -1;
                    } else {
                        b = 52;
                    }
                    break;
                case 2072888499:
                    list = listA;
                    if (!str.equals("manual_tracking_urls")) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                default:
                    list = listA;
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    listZzd13 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 1:
                    String strNextString18 = jsonReader.nextString();
                    i = !"banner".equals(strNextString18) ? !"interstitial".equals(strNextString18) ? !"native_express".equals(strNextString18) ? !"native".equals(strNextString18) ? !"rewarded".equals(strNextString18) ? (!"app_open_ad".equals(strNextString18) && !"app_open_ad_v2".equals(strNextString18)) ? !"rewarded_interstitial".equals(strNextString18) ? 0 : 7 : 6 : 5 : 4 : 3 : 2 : 1;
                    break;
                case 2:
                    listZzd12 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 3:
                    listZzd11 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 4:
                    listZzd10 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 5:
                    int iNextInt5 = jsonReader.nextInt();
                    i2 = (iNextInt5 != 0 && iNextInt5 != 1) ? 0 : iNextInt5;
                    break;
                case 6:
                    listZzd9 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 7:
                    listZzd8 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 8:
                    listZzd7 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 9:
                    strNextString = jsonReader.nextString();
                    break;
                case 10:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 11:
                    zzcccVarZza = zzccc.zza(com.google.android.gms.ads.internal.util.zzbu.zze(jsonReader));
                    break;
                case 12:
                    listZzd6 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 13:
                    listZzd5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 14:
                    listZzd4 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 15:
                    listZzd3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 17:
                    listA2 = zzfct.a(jsonReader);
                    break;
                case 18:
                    zzfcxVar = new zzfcx(jsonReader);
                    break;
                case 19:
                    listA = zzfct.a(jsonReader);
                    continue;
                case 20:
                    listZzd2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 21:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 23:
                    strNextString4 = jsonReader.nextString();
                    break;
                case 24:
                    strNextString5 = jsonReader.nextString();
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader).toString();
                    break;
                case 26:
                    zzcdlVarZza = zzcdl.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case 27:
                    strNextString6 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObjectZzh2 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 29:
                    jSONObjectZzh3 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    break;
                case 37:
                    String strNextString19 = jsonReader.nextString();
                    i3 = !"landscape".equalsIgnoreCase(strNextString19) ? !"portrait".equalsIgnoreCase(strNextString19) ? -1 : 7 : 6;
                    break;
                case 38:
                    iNextInt2 = jsonReader.nextInt();
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    break;
                case 40:
                    strNextString7 = jsonReader.nextString();
                    break;
                case 41:
                    jSONObjectZzh4 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    break;
                case 44:
                    iNextInt3 = jsonReader.nextInt();
                    break;
                case 45:
                    iNextInt4 = jsonReader.nextInt();
                    break;
                case 46:
                    strNextString8 = jsonReader.nextString();
                    break;
                case 47:
                    strNextString9 = jsonReader.nextString();
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    break;
                case 49:
                    zzbzgVarZza = zzbzg.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case 50:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    break;
                case 51:
                    zzsVarZza = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case 52:
                    strNextString10 = jsonReader.nextString();
                    break;
                case 53:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    break;
                case 54:
                    jSONObjectZzh5 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 55:
                    strNextString11 = jsonReader.nextString();
                    break;
                case 56:
                    if (!((Boolean) zzbiy.zzfO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                    } else {
                        strNextString12 = jsonReader.nextString();
                    }
                    break;
                case 57:
                    if (!((Boolean) zzbiy.zzfO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                    } else {
                        strNextString13 = jsonReader.nextString();
                    }
                    break;
                case 58:
                    if (!((Boolean) zzbiy.zzfO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                    } else {
                        strNextString14 = jsonReader.nextString();
                    }
                    break;
                case 59:
                    if (!((Boolean) zzbiy.zzfO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                    } else {
                        strNextString15 = jsonReader.nextString();
                    }
                    break;
                case 60:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    break;
                case 61:
                    jSONObjectZzh6 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 62:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    break;
                case 63:
                    strNextString17 = jsonReader.nextString();
                    break;
                case 64:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    break;
                case 65:
                    listZzd = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 66:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    break;
                case 67:
                    strNextString16 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            listA = list;
        }
        jsonReader.endObject();
        this.zza = listZzd13;
        this.zzb = i;
        this.zzc = listZzd12;
        this.zzd = listZzd11;
        this.zzg = listZzd10;
        this.zzf = i2;
        this.zzh = listZzd9;
        this.zzi = listZzd8;
        this.zzj = listZzd7;
        this.zzk = strNextString;
        this.zzl = strNextString2;
        this.zzm = zzcccVarZza;
        this.zzn = listZzd6;
        this.zzo = listZzd5;
        this.zzp = listZzd4;
        this.zzq = listZzd3;
        this.zzr = iNextInt;
        this.zzs = listA2;
        this.zzt = zzfcxVar;
        this.zzu = listZzd2;
        this.zzv = listA;
        this.zzx = strNextString3;
        this.zzw = jSONObjectZzh;
        this.zzy = strNextString4;
        this.zzz = strNextString5;
        this.zzA = string;
        this.zzB = zzcdlVarZza;
        this.zzC = strNextString6;
        this.zzD = jSONObjectZzh2;
        this.zzE = jSONObjectZzh3;
        this.zzK = zNextBoolean;
        this.zzL = zNextBoolean2;
        this.zzM = zNextBoolean3;
        this.zzN = zNextBoolean4;
        this.zzO = zNextBoolean5;
        this.zzP = zNextBoolean6;
        this.zzQ = zNextBoolean7;
        this.zzR = i3;
        this.zzS = iNextInt2;
        this.zzU = zNextBoolean8;
        this.zzV = strNextString7;
        this.zzW = new zzfdq(jSONObjectZzh4);
        this.zzX = zNextBoolean9;
        this.zzY = zNextBoolean10;
        this.zzZ = iNextInt3;
        this.zzaa = strNextString8;
        this.zzab = iNextInt4;
        this.zzac = strNextString9;
        this.zzad = zNextBoolean11;
        this.zzae = zzbzgVarZza;
        this.zzaf = zNextBoolean12;
        this.zzag = zzsVarZza;
        this.zzah = strNextString10;
        this.zzai = zNextBoolean13;
        this.zzaj = jSONObjectZzh5;
        this.zzF = strNextString11;
        this.zzG = strNextString12;
        this.zzH = strNextString13;
        this.zzI = strNextString14;
        this.zzJ = strNextString15;
        this.zzak = zNextBoolean14;
        this.zzal = jSONObjectZzh6;
        this.zzam = zNextBoolean15;
        this.zzan = strNextString17;
        this.zzao = zNextBoolean16;
        this.zze = listZzd;
        this.zzT = zNextBoolean17;
        this.zzap = strNextString16;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }
}
