// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Wallet.proto

package com.az.wallet.server.proto;

public interface WalletBalanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.az.wallet.server.proto.WalletBalance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Supported currencies are EUR, USD and GBP
   * </pre>
   *
   * <code>.com.az.wallet.server.proto.WalletCurrency wallet_currency = 1;</code>
   */
  int getWalletCurrencyValue();
  /**
   * <pre>
   * Supported currencies are EUR, USD and GBP
   * </pre>
   *
   * <code>.com.az.wallet.server.proto.WalletCurrency wallet_currency = 1;</code>
   */
  com.az.wallet.server.proto.WalletCurrency getWalletCurrency();

  /**
   * <code>uint64 balance = 2;</code>
   */
  long getBalance();
}