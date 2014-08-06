package org.kurento.tool.rom.test;

import org.kurento.kmf.jsonrpcconnector.JsonRpcHandler;
import org.kurento.kmf.jsonrpcconnector.client.JsonRpcClient;
import org.kurento.kmf.jsonrpcconnector.client.JsonRpcClientLocal;
import org.kurento.tool.rom.transport.jsonrpcconnector.RomServerJsonRpcHandler;

public class LocalRomTest extends AbstractRomTest {

	private JsonRpcHandler<? extends Object> handler;

	@Override
	protected JsonRpcClient createJsonRpcClient() {
		return new JsonRpcClientLocal(handler);
	}

	@Override
	protected void startJsonRpcServer(RomServerJsonRpcHandler jsonRpcHandler) {
		this.handler = jsonRpcHandler;
	}

	@Override
	protected void destroyJsonRpcServer() {

	}

}