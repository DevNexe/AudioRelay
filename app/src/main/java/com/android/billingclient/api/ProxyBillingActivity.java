package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.a36;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {
    public ResultReceiver w;
    public ResultReceiver x;
    public boolean y;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int i4 = a36.c(intent, "ProxyBillingActivity").a;
            if (i2 != -1) {
                StringBuilder sb = new StringBuilder(85);
                sb.append("Activity finished with resultCode ");
                sb.append(i2);
                sb.append(" and billing's responseCode: ");
                sb.append(i4);
                a36.f("ProxyBillingActivity", sb.toString());
            } else if (i4 != 0) {
                i2 = -1;
                StringBuilder sb2 = new StringBuilder(85);
                sb2.append("Activity finished with resultCode ");
                sb2.append(i2);
                sb2.append(" and billing's responseCode: ");
                sb2.append(i4);
                a36.f("ProxyBillingActivity", sb2.toString());
            } else {
                i4 = 0;
            }
            ResultReceiver resultReceiver2 = this.w;
            if (resultReceiver2 != null) {
                resultReceiver2.send(i4, intent != null ? intent.getExtras() : null);
            } else {
                Intent intentA = a();
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        intentA.putExtras(intent.getExtras());
                    } else {
                        a36.f("ProxyBillingActivity", "Got null bundle!");
                        intentA.putExtra("RESPONSE_CODE", 6);
                        intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    }
                }
                sendBroadcast(intentA);
            }
        } else if (i == 101) {
            if (intent == null) {
                a36.f("ProxyBillingActivity", "Got null intent!");
            } else {
                int i5 = a36.a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    a36.f("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i3 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.x;
                if (resultReceiver != null) {
                    resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                }
            }
            i3 = 0;
            resultReceiver = this.x;
            if (resultReceiver != null) {
                resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("Got onActivityResult with wrong requestCode: ");
            sb3.append(i);
            sb3.append("; skipping...");
            a36.f("ProxyBillingActivity", sb3.toString());
        }
        this.y = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            a36.e("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.y = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.w = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            } else {
                if (bundle.containsKey("in_app_message_result_receiver")) {
                    this.x = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                    return;
                }
                return;
            }
        }
        a36.e("ProxyBillingActivity", "Launching Play Store billing flow");
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else {
                if (!getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                        pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                        this.x = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                        i = 101;
                    } else {
                        pendingIntent = null;
                    }
                    this.y = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                    return;
                }
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.w = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            }
            this.y = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e) {
            a36.g("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.w;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.x;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentA = a();
                    intentA.putExtra("RESPONSE_CODE", 6);
                    intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentA);
                }
            }
            this.y = false;
            finish();
            return;
        }
        i = 100;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.y) {
            Intent intentA = a();
            intentA.putExtra("RESPONSE_CODE", 1);
            intentA.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentA);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.w;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.x;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.y);
    }
}
